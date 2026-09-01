import java.util.Objects;

public class NetworkConnection {
    private final String host;
    private final int port;
    private ConnectionState state;

    public NetworkConnection(String host, int port) {
        this.host = Objects.requireNonNull(host);

        if (port < 1 || port > 65535) {
            throw new IllegalArgumentException("Port must be between 1 and 65535.");
        }

        this.port = port;
        state = new ClosedState(this);
    }

    public void connect() {
        state.connect();
    }

    public void receiveSynAck() {
        state.receiveSynAck();
    }

    public void send(String data) {
        state.send(Objects.requireNonNull(data));
    }

    public void receive(String data) {
        state.receive(Objects.requireNonNull(data));
    }

    public void disconnect() {
        state.disconnect();
    }

    public void receiveFinAck() {
        state.receiveFinAck();
    }

    void setState(ConnectionState state) {
        this.state = Objects.requireNonNull(state);
        System.out.println("State changed to: " + state.getName());
    }

    void sendSegment(String segment) {
        System.out.println("Sent to " + host + ":" + port + ": " + segment);
    }

    public void showStatus() {
        System.out.println("Connection to " + host + ":" + port + " is " + state.getName() + ".");
    }
}
