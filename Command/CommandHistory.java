import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;

public class CommandHistory {
    private final Deque<Command> history = new ArrayDeque<>();

    public void push(Command command) {
        history.push(Objects.requireNonNull(command));
    }

    public Command pop() {
        return history.poll();
    }
}
