import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class PaymentRequest {
    private final String accountNumber;
    private final BigDecimal amount;

    public PaymentRequest(String accountNumber, BigDecimal amount) {
        if (accountNumber == null || accountNumber.isBlank()) {
            throw new IllegalArgumentException("Account number is required");
        }

        Objects.requireNonNull(amount, "Amount is required");

        if (amount.signum() <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }

        this.accountNumber = accountNumber;
        this.amount = amount.setScale(2, RoundingMode.UNNECESSARY);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
