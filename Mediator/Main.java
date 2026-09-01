public class Main {
    public static void main(String[] args) {
        AuthenticationDialog dialog = new AuthenticationDialog();

        System.out.println("\n--- Login mode ---");
        dialog.printVisibleForm();
        dialog.getLoginUsername().enterText("student");
        dialog.getLoginPassword().enterText("patterns");
        dialog.getOkButton().click();

        System.out.println("\n--- Registration mode ---");
        dialog.getLoginOrRegisterCheckbox().setChecked(false);
        dialog.printVisibleForm();
        dialog.getRegistrationUsername().enterText("new-user");
        dialog.getRegistrationPassword().enterText("secure123");
        dialog.getRegistrationEmail().enterText("new-user@example.com");
        dialog.getOkButton().click();

        System.out.println("\n--- Cancel ---");
        dialog.getCancelButton().click();
    }
}
