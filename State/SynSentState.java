public class SynSentState extends ConnectionState {
    public SynSentState(NetworkConnection connection) {
        super(connection);
    }

    @Override
    public void receiveSynAck() {
        System.out.println("Received: SYN-ACK");
        connection.sendSegment("ACK");
        connection.setState(new EstablishedState(connection));
    }

    @Override
    public void disconnect() {
        System.out.println("Connection attempt cancelled.");
        connection.setState(new ClosedState(connection));
    }

    @Override
    public String getName() {
        return "SYN_SENT";
    }
}
