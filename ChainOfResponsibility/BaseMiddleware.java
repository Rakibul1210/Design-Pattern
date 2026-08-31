import java.util.Objects;

public abstract class BaseMiddleware implements Middleware {
    private Middleware next;

    @Override
    public Middleware setNext(Middleware next) {
        this.next = Objects.requireNonNull(next);
        return next;
    }

    protected boolean handleNext(HttpRequest request) {
        return next == null || next.handle(request);
    }
}
