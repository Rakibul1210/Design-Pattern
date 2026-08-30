import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        PaymentRequest request = new PaymentRequest(
                "ACC-1001",
                new BigDecimal("49.99"));

        CheckoutService cardCheckout = new CheckoutService(
                new CardPaymentGateway());
        cardCheckout.checkout(request);

        LegacyBankApi legacyBankApi = new LegacyBankApi();
        PaymentGateway adaptedGateway = new LegacyBankAdapter(legacyBankApi);
        CheckoutService legacyCheckout = new CheckoutService(adaptedGateway);
        legacyCheckout.checkout(request);
    }
}
