public class LoggingMiddleware extends BaseMiddleware {
    @Override
    public boolean handle(HttpRequest request) {
        System.out.printf(
                "Logging: %s %s from %s%n",
                request.getMethod(),
                request.getPath(),
                request.getClientIp());

        return handleNext(request);
    }
}
