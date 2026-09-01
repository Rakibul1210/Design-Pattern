public class ClosedState extends ConnectionState {
    public ClosedState(NetworkConnection connection) {
        super(connection);
    }

    @Override
    public void connect() {
        connection.sendSegment("SYN");
        connection.setState(new SynSentState(connection));
    }

    @Override
    public void disconnect() {
        System.out.println("The connection is already closed.");
    }

    @Override
    public String getName() {
        return "CLOSED";
    }
}
