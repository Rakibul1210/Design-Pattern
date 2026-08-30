public class BasicVideoStream implements VideoStream {
    private final String title;

    public BasicVideoStream(String title) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Video title is required");
        }

        this.title = title;
    }

    @Override
    public void play() {
        System.out.println("Playing video: " + title);
    }

    @Override
    public String getDescription() {
        return title;
    }
}
