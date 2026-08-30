public class Giant extends Troop {
    public Giant(int level, int health, int damage) {
        super("Giant", level, health, damage);
    }

    private Giant(Giant source) {
        super(source);
    }

    @Override
    public Giant cloneTroop() {
        return new Giant(this);
    }
}
