public class Button extends Component {
    private final String label;

    public Button(Mediator dialog, String label) {
        super(dialog);
        this.label = label;
    }

    public void click() {
        System.out.println(label + " button clicked.");
        dialog.notify(this, "click");
    }
}
