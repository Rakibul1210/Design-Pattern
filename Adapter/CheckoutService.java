import java.util.Objects;

public class CheckoutService {
    private final PaymentGateway paymentGateway;

    public CheckoutService(PaymentGateway paymentGateway) {
        this.paymentGateway = Objects.requireNonNull(paymentGateway);
    }

    public void checkout(PaymentRequest request) {
        paymentGateway.pay(request);
    }
}
