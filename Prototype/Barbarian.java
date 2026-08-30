public class Barbarian extends Troop {
    public Barbarian(int level, int health, int damage) {
        super("Barbarian", level, health, damage);
    }

    private Barbarian(Barbarian source) {
        super(source);
    }

    @Override
    public Barbarian cloneTroop() {
        return new Barbarian(this);
    }
}
