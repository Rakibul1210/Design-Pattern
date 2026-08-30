public final class TreeType {
    private final String name;
    private final String color;
    private final String texture;

    TreeType(String name, String color, String texture) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Tree name is required");
        }

        if (color == null || color.isBlank()) {
            throw new IllegalArgumentException("Tree color is required");
        }

        if (texture == null || texture.isBlank()) {
            throw new IllegalArgumentException("Tree texture is required");
        }

        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    public void draw(int x, int y) {
        System.out.printf(
                "Drawing %s tree at (%d, %d) [color=%s, texture=%s]%n",
                name,
                x,
                y,
                color,
                texture);
    }
}
