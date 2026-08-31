public class CopyCommand extends Command {
    public CopyCommand(Application application, Editor editor) {
        super(application, editor);
    }

    @Override
    public boolean execute() {
        application.setClipboard(editor.getSelection());
        return false;
    }
}
