public class VideoFile {
    private final String filename;

    public VideoFile(String filename) {
        if (filename == null || filename.isBlank()) {
            throw new IllegalArgumentException("Video filename is required");
        }

        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }

    public String getExtension() {
        int separatorIndex = Math.max(
                filename.lastIndexOf('/'),
                filename.lastIndexOf('\\'));
        int dotIndex = filename.lastIndexOf('.');

        if (dotIndex <= separatorIndex || dotIndex == filename.length() - 1) {
            throw new IllegalArgumentException(
                    "Video file must have an extension: " + filename);
        }

        return filename.substring(dotIndex + 1).toLowerCase();
    }
}
