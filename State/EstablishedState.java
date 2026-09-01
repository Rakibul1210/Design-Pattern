public class EstablishedState extends ConnectionState {
    public EstablishedState(NetworkConnection connection) {
        super(connection);
    }

    @Override
    public void connect() {
        System.out.println("The connection is already established.");
    }

    @Override
    public void send(String data) {
        connection.sendSegment("DATA: " + data);
    }

    @Override
    public void receive(String data) {
        System.out.println("Received: DATA: " + data);
        connection.sendSegment("ACK");
        System.out.println("Delivered to application: " + data);
    }

    @Override
    public void disconnect() {
        connection.sendSegment("FIN");
        connection.setState(new FinWaitState(connection));
    }

    @Override
    public String getName() {
        return "ESTABLISHED";
    }
}
