public class Game {
    private final String playerName;
    private int level;
    private int health;
    private String location;

    public Game(String playerName, int level, int health, String location) {
        this.playerName = playerName;
        this.level = level;
        this.health = health;
        this.location = location;
    }

    public void moveTo(String location) {
        this.location = location;
        System.out.println(playerName + " moved to " + location + ".");
    }

    public void takeDamage(int damage) {
        health = Math.max(0, health - damage);
        System.out.println(playerName + " took " + damage + " damage.");
    }

    public void levelUp() {
        level++;
        System.out.println(playerName + " reached level " + level + ".");
    }

    public Memento save() {
        System.out.println("Checkpoint saved.");
        return new GameSnapshot(level, health, location);
    }

    public void restore(Memento memento) {
        if (!(memento instanceof GameSnapshot)) {
            throw new IllegalArgumentException("This checkpoint does not belong to Game.");
        }

        GameSnapshot snapshot = (GameSnapshot) memento;
        level = snapshot.level;
        health = snapshot.health;
        location = snapshot.location;
        System.out.println("Checkpoint restored.");
    }

    public void showState() {
        System.out.println("Player: " + playerName);
        System.out.println("Level: " + level);
        System.out.println("Health: " + health);
        System.out.println("Location: " + location);
    }

    private static final class GameSnapshot implements Memento {
        private final int level;
        private final int health;
        private final String location;

        private GameSnapshot(int level, int health, String location) {
            this.level = level;
            this.health = health;
            this.location = location;
        }
    }
}
