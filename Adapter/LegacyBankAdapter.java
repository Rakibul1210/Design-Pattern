import java.util.Objects;

public class LegacyBankAdapter implements PaymentGateway {
    private final LegacyBankApi legacyBankApi;

    public LegacyBankAdapter(LegacyBankApi legacyBankApi) {
        this.legacyBankApi = Objects.requireNonNull(legacyBankApi);
    }

    @Override
    public void pay(PaymentRequest request) {
        int amountInCents = request
                .getAmount()
                .movePointRight(2)
                .intValueExact();

        legacyBankApi.makeTransaction(
                request.getAccountNumber(),
                amountInCents);
    }
}
