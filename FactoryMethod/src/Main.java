

public class Main {
    public static void main(String[] args) {
        Cricket cricket = CricketFactory.getCricket("ODI");
        cricket.play();
    }
}