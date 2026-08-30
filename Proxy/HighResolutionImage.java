public class HighResolutionImage implements Image {
    private final String filename;

    public HighResolutionImage(String filename) {
        if (filename == null || filename.isBlank()) {
            throw new IllegalArgumentException("Image filename is required");
        }

        this.filename = filename;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading large image: " + filename);
    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + filename);
    }
}
