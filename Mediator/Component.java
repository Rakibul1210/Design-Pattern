public abstract class Component {
    protected final Mediator dialog;
    private boolean visible = true;

    protected Component(Mediator dialog) {
        this.dialog = dialog;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }
}
