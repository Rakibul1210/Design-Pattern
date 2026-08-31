public class RouteHandler extends BaseMiddleware {
    @Override
    public boolean handle(HttpRequest request) {
        System.out.printf(
                "Route: executed %s %s%n",
                request.getMethod(),
                request.getPath());

        return true;
    }
}
