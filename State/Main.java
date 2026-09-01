public class Main {
    public static void main(String[] args) {
        NetworkConnection connection = new NetworkConnection("api.example.com", 443);

        System.out.println("--- Before connecting ---");
        connection.showStatus();
        connection.send("GET /status");

        System.out.println("\n--- Three-way handshake ---");
        connection.connect();
        connection.send("GET /status");
        connection.receiveSynAck();

        System.out.println("\n--- Data transfer ---");
        connection.connect();
        connection.send("GET /status");
        connection.receive("200 OK");

        System.out.println("\n--- Graceful shutdown ---");
        connection.disconnect();
        connection.send("late data");
        connection.receiveFinAck();
        connection.showStatus();
    }
}
