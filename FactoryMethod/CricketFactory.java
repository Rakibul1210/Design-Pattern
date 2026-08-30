public abstract class CricketFactory {
    protected abstract Cricket createCricket();

    public void startMatch() {
        Cricket cricket = createCricket();
        cricket.play();
    }
}
