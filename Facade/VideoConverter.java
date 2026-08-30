public class VideoConverter {
    public ConvertedVideo convert(String filename, String format) {
        VideoFile file = new VideoFile(filename);
        Codec sourceCodec = new CodecFactory().extract(file);
        Codec destinationCodec = createDestinationCodec(format);

        VideoBuffer buffer = BitrateReader.read(file, sourceCodec);
        VideoBuffer converted = BitrateReader.convert(
                buffer,
                destinationCodec);
        VideoBuffer finalResult = new AudioMixer().fix(converted);

        return new ConvertedVideo(
                createOutputFilename(filename, destinationCodec),
                finalResult);
    }

    private Codec createDestinationCodec(String format) {
        if (format == null || format.isBlank()) {
            throw new IllegalArgumentException("Destination format is required");
        }

        String normalizedFormat = format
                .replaceFirst("^\\.", "")
                .toLowerCase();

        if (normalizedFormat.equals("mp4")) {
            return new MPEG4CompressionCodec();
        }

        if (normalizedFormat.equals("ogg")) {
            return new OggCompressionCodec();
        }

        throw new IllegalArgumentException(
                "Unsupported destination format: " + format);
    }

    private String createOutputFilename(
            String filename,
            Codec destinationCodec) {
        int separatorIndex = Math.max(
                filename.lastIndexOf('/'),
                filename.lastIndexOf('\\'));
        int dotIndex = filename.lastIndexOf('.');

        String baseName = dotIndex > separatorIndex
                ? filename.substring(0, dotIndex)
                : filename;

        return baseName + "." + destinationCodec.getExtension();
    }
}
