public class TestCricketFactory extends CricketFactory {
    @Override
    protected Cricket createCricket() {
        return new TestCricket();
    }
}
