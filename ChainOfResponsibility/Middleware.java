public interface Middleware {
    Middleware setNext(Middleware next);

    boolean handle(HttpRequest request);
}
