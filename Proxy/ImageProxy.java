public class ImageProxy implements Image {
    private final String filename;
    private HighResolutionImage realImage;

    public ImageProxy(String filename) {
        if (filename == null || filename.isBlank()) {
            throw new IllegalArgumentException("Image filename is required");
        }

        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new HighResolutionImage(filename);
        }

        realImage.display();
    }
}
