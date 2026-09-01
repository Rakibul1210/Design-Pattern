public abstract class ConnectionState {
    protected final NetworkConnection connection;

    protected ConnectionState(NetworkConnection connection) {
        this.connection = connection;
    }

    public void connect() {
        reject("start another connection");
    }

    public void receiveSynAck() {
        reject("process SYN-ACK");
    }

    public void send(String data) {
        reject("send application data");
    }

    public void receive(String data) {
        reject("receive application data");
    }

    public void disconnect() {
        reject("close the connection");
    }

    public void receiveFinAck() {
        reject("process FIN-ACK");
    }

    public abstract String getName();

    protected void reject(String action) {
        System.out.println("Cannot " + action + " while in " + getName() + " state.");
    }
}
