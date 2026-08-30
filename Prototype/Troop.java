public abstract class Troop {
    private final String type;
    private final int level;
    private final int health;
    private final int damage;
    private final Position position;

    protected Troop(String type, int level, int health, int damage) {
        this.type = type;
        this.level = level;
        this.health = health;
        this.damage = damage;
        this.position = new Position(0, 0);
    }

    protected Troop(Troop source) {
        this.type = source.type;
        this.level = source.level;
        this.health = source.health;
        this.damage = source.damage;
        this.position = new Position(source.position);
    }

    public abstract Troop cloneTroop();

    public void deployAt(int x, int y) {
        position.moveTo(x, y);
    }

    public void display() {
        System.out.printf(
                "%s | level=%d, health=%d, damage=%d, position=%s%n",
                type,
                level,
                health,
                damage,
                position);
    }
}
