import java.util.HashMap;
import java.util.Map;

public class RateLimitMiddleware extends BaseMiddleware {
    private final int maximumRequestsPerClient;
    private final Map<String, Integer> requestCounts = new HashMap<>();

    public RateLimitMiddleware(int maximumRequestsPerClient) {
        if (maximumRequestsPerClient < 1) {
            throw new IllegalArgumentException(
                    "Maximum request count must be positive");
        }

        this.maximumRequestsPerClient = maximumRequestsPerClient;
    }

    @Override
    public boolean handle(HttpRequest request) {
        String clientIp = request.getClientIp();
        int requestCount = requestCounts.merge(clientIp, 1, Integer::sum);

        if (requestCount > maximumRequestsPerClient) {
            System.out.println("Rate limit: request rejected");
            return false;
        }

        System.out.println("Rate limit: passed");
        return handleNext(request);
    }
}
