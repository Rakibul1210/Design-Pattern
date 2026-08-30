public class CardPaymentGateway implements PaymentGateway {
    @Override
    public void pay(PaymentRequest request) {
        System.out.println(
                "Card gateway processed $"
                        + request.getAmount().toPlainString()
                        + " for account "
                        + request.getAccountNumber());
    }
}
