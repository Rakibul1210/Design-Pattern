public class Archer extends Troop {
    public Archer(int level, int health, int damage) {
        super("Archer", level, health, damage);
    }

    private Archer(Archer source) {
        super(source);
    }

    @Override
    public Archer cloneTroop() {
        return new Archer(this);
    }
}
