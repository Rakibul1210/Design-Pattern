public class FinWaitState extends ConnectionState {
    public FinWaitState(NetworkConnection connection) {
        super(connection);
    }

    @Override
    public void disconnect() {
        System.out.println("Connection shutdown is already in progress.");
    }

    @Override
    public void receiveFinAck() {
        System.out.println("Received: FIN-ACK");
        connection.sendSegment("ACK");
        connection.setState(new ClosedState(connection));
    }

    @Override
    public String getName() {
        return "FIN_WAIT";
    }
}
