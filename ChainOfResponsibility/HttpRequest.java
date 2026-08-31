public class HttpRequest {
    private final String method;
    private final String path;
    private final String clientIp;
    private final String authToken;
    private final String body;

    public HttpRequest(
            String method,
            String path,
            String clientIp,
            String authToken,
            String body) {
        if (method == null || method.isBlank()) {
            throw new IllegalArgumentException("HTTP method is required");
        }

        if (path == null || path.isBlank()) {
            throw new IllegalArgumentException("Request path is required");
        }

        if (clientIp == null || clientIp.isBlank()) {
            throw new IllegalArgumentException("Client IP is required");
        }

        this.method = method.toUpperCase();
        this.path = path;
        this.clientIp = clientIp;
        this.authToken = authToken;
        this.body = body;
    }

    public String getMethod() {
        return method;
    }

    public String getPath() {
        return path;
    }

    public String getClientIp() {
        return clientIp;
    }

    public String getAuthToken() {
        return authToken;
    }

    public String getBody() {
        return body;
    }
}
