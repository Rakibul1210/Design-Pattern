import java.util.Objects;

public class Application {
    private String clipboard = "";
    private final Editor activeEditor;
    private final CommandHistory history = new CommandHistory();

    public Application(Editor activeEditor) {
        this.activeEditor = Objects.requireNonNull(activeEditor);
    }

    public void executeCommand(Command command) {
        Command validCommand = Objects.requireNonNull(command);

        if (validCommand.execute()) {
            history.push(validCommand);
        }
    }

    public void undo() {
        Command command = history.pop();

        if (command != null) {
            command.undo();
        }
    }

    public String getClipboard() {
        return clipboard;
    }

    public void setClipboard(String clipboard) {
        this.clipboard = Objects.requireNonNull(clipboard);
    }

    public Editor getActiveEditor() {
        return activeEditor;
    }
}
