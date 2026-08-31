import java.util.Set;

public class ValidationMiddleware extends BaseMiddleware {
    private static final Set<String> METHODS_REQUIRING_BODY =
            Set.of("POST", "PUT", "PATCH");

    @Override
    public boolean handle(HttpRequest request) {
        boolean requiresBody = METHODS_REQUIRING_BODY.contains(
                request.getMethod());
        boolean hasBody = request.getBody() != null
                && !request.getBody().isBlank();

        if (requiresBody && !hasBody) {
            System.out.println("Validation: request body is required");
            return false;
        }

        System.out.println("Validation: passed");
        return handleNext(request);
    }
}
