import java.util.Objects;

public abstract class VideoStreamDecorator implements VideoStream {
    protected final VideoStream wrappedVideo;

    protected VideoStreamDecorator(VideoStream wrappedVideo) {
        this.wrappedVideo = Objects.requireNonNull(wrappedVideo);
    }

    @Override
    public String getDescription() {
        return wrappedVideo.getDescription();
    }
}
