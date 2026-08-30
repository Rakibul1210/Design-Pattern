public class VideoBuffer {
    private final String sourceFilename;
    private final String codecName;
    private final boolean audioFixed;

    public VideoBuffer(
            String sourceFilename,
            String codecName,
            boolean audioFixed) {
        this.sourceFilename = sourceFilename;
        this.codecName = codecName;
        this.audioFixed = audioFixed;
    }

    public VideoBuffer convertTo(Codec codec) {
        return new VideoBuffer(sourceFilename, codec.getName(), audioFixed);
    }

    public VideoBuffer withFixedAudio() {
        return new VideoBuffer(sourceFilename, codecName, true);
    }

    public String getCodecName() {
        return codecName;
    }

    public boolean isAudioFixed() {
        return audioFixed;
    }
}
