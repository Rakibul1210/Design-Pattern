public class LanguageAudioDecorator extends VideoStreamDecorator {
    private final String audioLanguage;

    public LanguageAudioDecorator(
            VideoStream wrappedVideo,
            String audioLanguage) {
        super(wrappedVideo);

        if (audioLanguage == null || audioLanguage.isBlank()) {
            throw new IllegalArgumentException("Audio language is required");
        }

        this.audioLanguage = audioLanguage;
    }

    @Override
    public void play() {
        wrappedVideo.play();
        System.out.println("Using " + audioLanguage + " audio");
    }

    @Override
    public String getDescription() {
        return wrappedVideo.getDescription()
                + ", "
                + audioLanguage
                + " audio";
    }
}
