public class CutCommand extends Command {
    public CutCommand(Application application, Editor editor) {
        super(application, editor);
    }

    @Override
    public boolean execute() {
        saveBackup();
        application.setClipboard(editor.getSelection());
        editor.deleteSelection();
        return true;
    }
}
