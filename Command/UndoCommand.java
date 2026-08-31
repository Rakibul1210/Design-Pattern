public class UndoCommand extends Command {
    public UndoCommand(Application application, Editor editor) {
        super(application, editor);
    }

    @Override
    public boolean execute() {
        application.undo();
        return false;
    }
}
