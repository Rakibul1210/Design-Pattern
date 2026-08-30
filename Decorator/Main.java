public class Main {
    public static void main(String[] args) {
        VideoStream video = new BasicVideoStream("Nature Documentary");

        video = new LanguageAudioDecorator(video, "Spanish");
        video = new SubtitleDecorator(video, "English");

        System.out.println("Stream: " + video.getDescription());
        video.play();
    }
}
