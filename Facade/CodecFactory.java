public class CodecFactory {
    public Codec extract(VideoFile file) {
        String extension = file.getExtension();

        if (extension.equals("mp4")) {
            return new MPEG4CompressionCodec();
        }

        if (extension.equals("ogg")) {
            return new OggCompressionCodec();
        }

        throw new IllegalArgumentException(
                "Unsupported source format: " + extension);
    }
}
