public class ODICricketFactory extends CricketFactory {
    @Override
    protected Cricket createCricket() {
        return new ODI();
    }
}
