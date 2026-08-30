public class BitrateReader {
    private BitrateReader() {}

    public static VideoBuffer read(VideoFile file, Codec sourceCodec) {
        System.out.println(
                "Reading "
                        + file.getFilename()
                        + " with "
                        + sourceCodec.getName()
                        + " codec");

        return new VideoBuffer(
                file.getFilename(),
                sourceCodec.getName(),
                false);
    }

    public static VideoBuffer convert(
            VideoBuffer buffer,
            Codec destinationCodec) {
        System.out.println(
                "Converting video to " + destinationCodec.getName());

        return buffer.convertTo(destinationCodec);
    }
}
