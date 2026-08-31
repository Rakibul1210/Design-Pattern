import java.util.Objects;

public class AuthenticationMiddleware extends BaseMiddleware {
    private final String expectedToken;

    public AuthenticationMiddleware(String expectedToken) {
        if (expectedToken == null || expectedToken.isBlank()) {
            throw new IllegalArgumentException("Expected token is required");
        }

        this.expectedToken = expectedToken;
    }

    @Override
    public boolean handle(HttpRequest request) {
        if (!Objects.equals(expectedToken, request.getAuthToken())) {
            System.out.println("Authentication: invalid token");
            return false;
        }

        System.out.println("Authentication: passed");
        return handleNext(request);
    }
}
