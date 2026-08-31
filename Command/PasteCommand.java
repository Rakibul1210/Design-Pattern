public class PasteCommand extends Command {
    public PasteCommand(Application application, Editor editor) {
        super(application, editor);
    }

    @Override
    public boolean execute() {
        saveBackup();
        editor.replaceSelection(application.getClipboard());
        return true;
    }
}
