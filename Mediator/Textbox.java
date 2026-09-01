public class Textbox extends Component {
    private final String name;
    private String text = "";
    private String error = "";

    public Textbox(Mediator dialog, String name) {
        super(dialog);
        this.name = name;
    }

    public void enterText(String text) {
        this.text = text;
        dialog.notify(this, "keypress");
    }

    public String getText() {
        return text;
    }

    public void showError(String error) {
        this.error = error;
        System.out.println(name + " error: " + error);
    }

    public void clearError() {
        error = "";
    }

    public void clear() {
        text = "";
        error = "";
    }
}
