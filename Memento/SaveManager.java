import java.util.ArrayDeque;
import java.util.Deque;

public class SaveManager {
    private final Deque<Memento> checkpoints = new ArrayDeque<>();

    public void addCheckpoint(Memento checkpoint) {
        checkpoints.push(checkpoint);
    }

    public Memento getLatestCheckpoint() {
        if (checkpoints.isEmpty()) {
            throw new IllegalStateException("No checkpoint has been saved.");
        }
        return checkpoints.peek();
    }

    public int getCheckpointCount() {
        return checkpoints.size();
    }
}
