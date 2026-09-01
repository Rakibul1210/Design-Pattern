public class Checkbox extends Component {
    private boolean checked;

    public Checkbox(Mediator dialog, boolean checked) {
        super(dialog);
        this.checked = checked;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
        dialog.notify(this, "check");
    }
}
