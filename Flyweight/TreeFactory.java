import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TreeFactory {
    private final Map<List<String>, TreeType> treeTypes = new HashMap<>();

    public TreeType getTreeType(
            String name,
            String color,
            String texture) {
        List<String> key = List.of(name, color, texture);

        return treeTypes.computeIfAbsent(
                key,
                unused -> new TreeType(name, color, texture));
    }

    public int getCreatedTypeCount() {
        return treeTypes.size();
    }
}
