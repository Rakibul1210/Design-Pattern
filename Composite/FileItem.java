public class FileItem implements FileSystemItem {
    private final String name;
    private final long size;

    public FileItem(String name, long size) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("File name is required");
        }

        if (size < 0) {
            throw new IllegalArgumentException("File size cannot be negative");
        }

        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public long getSize() {
        return size;
    }

    @Override
    public void display(String indent) {
        System.out.printf("%s- %s (%d bytes)%n", indent, name, size);
    }
}
