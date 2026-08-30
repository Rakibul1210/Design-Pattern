public interface FileSystemItem {
    String getName();

    long getSize();

    void display(String indent);
}
