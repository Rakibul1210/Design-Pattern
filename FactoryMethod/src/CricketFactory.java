
class CricketFactory {
    public static Cricket getCricket(String cricketType) {
        if (cricketType == null) {
            return null;
        }
        if (cricketType.equalsIgnoreCase("Test")) {
            return new TestCricket();
        } else if (cricketType.equalsIgnoreCase("T20")) {
            return new T20();
        } else if (cricketType.equalsIgnoreCase("ODI")) {
            return new ODI();
        }
        return null;
    }
}