public class Main {
    public static void main(String[] args) {
        Game game = new Game("Arin", 8, 100, "Castle Entrance");
        SaveManager saveManager = new SaveManager();

        System.out.println("--- Before the boss fight ---");
        game.showState();
        saveManager.addCheckpoint(game.save());

        System.out.println("\n--- During the boss fight ---");
        game.moveTo("Boss Room");
        game.takeDamage(85);
        game.levelUp();
        game.showState();

        System.out.println("\n--- Loading the checkpoint ---");
        game.restore(saveManager.getLatestCheckpoint());
        game.showState();
    }
}
