
public class CPU {
    private static CPU instance;

    private CPU() {}
    public static CPU getInstance() {
        if (instance == null) {
            instance = new CPU();
        }
        return instance;
    }

}