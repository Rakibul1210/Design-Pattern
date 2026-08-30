public class T20CricketFactory extends CricketFactory {
    @Override
    protected Cricket createCricket() {
        return new T20();
    }
}
