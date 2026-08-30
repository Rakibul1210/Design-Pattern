public class Main {
    public static void main(String[] args) {
        VideoConverter converter = new VideoConverter();

        ConvertedVideo mp4 = converter.convert(
                "funny-cats-video.ogg",
                "mp4");

        mp4.save();
    }
}
