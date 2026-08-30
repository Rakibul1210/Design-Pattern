public class AudioMixer {
    public VideoBuffer fix(VideoBuffer buffer) {
        System.out.println("Fixing converted audio");
        return buffer.withFixedAudio();
    }
}
