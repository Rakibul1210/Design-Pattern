public class ConvertedVideo {
    private final String filename;
    private final VideoBuffer buffer;

    public ConvertedVideo(String filename, VideoBuffer buffer) {
        this.filename = filename;
        this.buffer = buffer;
    }

    public void save() {
        System.out.println(
                "Saved "
                        + filename
                        + " [codec="
                        + buffer.getCodecName()
                        + ", audioFixed="
                        + buffer.isAudioFixed()
                        + "]");
    }
}
