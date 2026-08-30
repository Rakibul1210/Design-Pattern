public class SubtitleDecorator extends VideoStreamDecorator {
    private final String subtitleLanguage;

    public SubtitleDecorator(
            VideoStream wrappedVideo,
            String subtitleLanguage) {
        super(wrappedVideo);

        if (subtitleLanguage == null || subtitleLanguage.isBlank()) {
            throw new IllegalArgumentException("Subtitle language is required");
        }

        this.subtitleLanguage = subtitleLanguage;
    }

    @Override
    public void play() {
        wrappedVideo.play();
        System.out.println(
                "Displaying " + subtitleLanguage + " subtitles");
    }

    @Override
    public String getDescription() {
        return wrappedVideo.getDescription()
                + ", "
                + subtitleLanguage
                + " subtitles";
    }
}
