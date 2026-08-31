import java.util.Objects;

public abstract class Command {
    protected final Application application;
    protected final Editor editor;
    private String backup;

    protected Command(Application application, Editor editor) {
        this.application = Objects.requireNonNull(application);
        this.editor = Objects.requireNonNull(editor);
    }

    protected void saveBackup() {
        backup = editor.getText();
    }

    public void undo() {
        if (backup == null) {
            throw new IllegalStateException("No editor backup is available");
        }

        editor.setText(backup);
    }

    public abstract boolean execute();
}
