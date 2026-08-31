public class Main {
    public static void main(String[] args) {
        Middleware pipeline = new LoggingMiddleware();

        pipeline
                .setNext(new RateLimitMiddleware(1))
                .setNext(new AuthenticationMiddleware("valid-token"))
                .setNext(new ValidationMiddleware())
                .setNext(new RouteHandler());

        process(
                pipeline,
                "Valid request",
                new HttpRequest(
                        "POST",
                        "/orders",
                        "10.0.0.1",
                        "valid-token",
                        "{\"productId\": 42}"));

        process(
                pipeline,
                "Invalid authentication",
                new HttpRequest(
                        "GET",
                        "/account",
                        "10.0.0.2",
                        "wrong-token",
                        null));

        process(
                pipeline,
                "Invalid request body",
                new HttpRequest(
                        "POST",
                        "/orders",
                        "10.0.0.3",
                        "valid-token",
                        ""));

        process(
                pipeline,
                "Rate limit exceeded",
                new HttpRequest(
                        "GET",
                        "/orders",
                        "10.0.0.1",
                        "valid-token",
                        null));
    }

    private static void process(
            Middleware pipeline,
            String label,
            HttpRequest request) {
        System.out.println("--- " + label + " ---");
        boolean successful = pipeline.handle(request);
        System.out.println("Request successful: " + successful);
        System.out.println();
    }
}
