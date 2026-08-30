import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Folder implements FileSystemItem {
    private final String name;
    private final List<FileSystemItem> children = new ArrayList<>();

    public Folder(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Folder name is required");
        }

        this.name = name;
    }

    public void add(FileSystemItem item) {
        Objects.requireNonNull(item, "File-system item is required");

        if (item == this) {
            throw new IllegalArgumentException("A folder cannot contain itself");
        }

        children.add(item);
    }

    public void remove(FileSystemItem item) {
        children.remove(item);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public long getSize() {
        long totalSize = 0;

        for (FileSystemItem child : children) {
            totalSize += child.getSize();
        }

        return totalSize;
    }

    @Override
    public void display(String indent) {
        System.out.printf(
                "%s+ %s/ (%d bytes)%n",
                indent,
                name,
                getSize());

        for (FileSystemItem child : children) {
            child.display(indent + "  ");
        }
    }
}
