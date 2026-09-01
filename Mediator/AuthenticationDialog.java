public class AuthenticationDialog implements Mediator {
    private String title;

    private final Checkbox loginOrRegisterCheckbox;

    private final Textbox loginUsername;
    private final Textbox loginPassword;

    private final Textbox registrationUsername;
    private final Textbox registrationPassword;
    private final Textbox registrationEmail;

    private final Button okButton;
    private final Button cancelButton;

    public AuthenticationDialog() {
        loginOrRegisterCheckbox = new Checkbox(this, true);

        loginUsername = new Textbox(this, "Login username");
        loginPassword = new Textbox(this, "Login password");

        registrationUsername = new Textbox(this, "Registration username");
        registrationPassword = new Textbox(this, "Registration password");
        registrationEmail = new Textbox(this, "Registration email");

        okButton = new Button(this, "OK");
        cancelButton = new Button(this, "Cancel");

        updateFormMode();
    }

    @Override
    public void notify(Component sender, String event) {
        if (sender == loginOrRegisterCheckbox && event.equals("check")) {
            updateFormMode();
            return;
        }

        if (sender instanceof Textbox && event.equals("keypress")) {
            ((Textbox) sender).clearError();
            return;
        }

        if (sender == okButton && event.equals("click")) {
            if (loginOrRegisterCheckbox.isChecked()) {
                logIn();
            } else {
                register();
            }
            return;
        }

        if (sender == cancelButton && event.equals("click")) {
            clearAllFields();
            System.out.println("Authentication cancelled.");
        }
    }

    private void updateFormMode() {
        boolean loginMode = loginOrRegisterCheckbox.isChecked();
        title = loginMode ? "Log in" : "Register";

        loginUsername.setVisible(loginMode);
        loginPassword.setVisible(loginMode);

        registrationUsername.setVisible(!loginMode);
        registrationPassword.setVisible(!loginMode);
        registrationEmail.setVisible(!loginMode);

        System.out.println("Dialog changed to: " + title);
    }

    private void logIn() {
        if (loginUsername.getText().equals("student")
                && loginPassword.getText().equals("patterns")) {
            System.out.println("Login successful. Welcome, student!");
            return;
        }

        loginUsername.showError("Username or password is incorrect.");
    }

    private void register() {
        boolean valid = true;

        if (registrationUsername.getText().isBlank()) {
            registrationUsername.showError("Username is required.");
            valid = false;
        }

        if (registrationPassword.getText().length() < 6) {
            registrationPassword.showError("Password must contain at least 6 characters.");
            valid = false;
        }

        if (!registrationEmail.getText().contains("@")) {
            registrationEmail.showError("Enter a valid email address.");
            valid = false;
        }

        if (valid) {
            System.out.println(
                    "Account created for " + registrationUsername.getText() + " and logged in."
            );
        }
    }

    private void clearAllFields() {
        loginUsername.clear();
        loginPassword.clear();
        registrationUsername.clear();
        registrationPassword.clear();
        registrationEmail.clear();
    }

    public void printVisibleForm() {
        System.out.println("Title: " + title);
        System.out.println("Login fields visible: " + loginUsername.isVisible());
        System.out.println("Registration fields visible: " + registrationUsername.isVisible());
    }

    public Checkbox getLoginOrRegisterCheckbox() {
        return loginOrRegisterCheckbox;
    }

    public Textbox getLoginUsername() {
        return loginUsername;
    }

    public Textbox getLoginPassword() {
        return loginPassword;
    }

    public Textbox getRegistrationUsername() {
        return registrationUsername;
    }

    public Textbox getRegistrationPassword() {
        return registrationPassword;
    }

    public Textbox getRegistrationEmail() {
        return registrationEmail;
    }

    public Button getOkButton() {
        return okButton;
    }

    public Button getCancelButton() {
        return cancelButton;
    }
}
