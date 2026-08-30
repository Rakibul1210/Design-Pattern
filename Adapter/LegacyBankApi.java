public class LegacyBankApi {
    public void makeTransaction(String accountNumber, int amountInCents) {
        System.out.println(
                "Legacy bank processed "
                        + amountInCents
                        + " cents for account "
                        + accountNumber);
    }
}
