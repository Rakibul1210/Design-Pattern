import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Forest {
    private final List<Tree> trees = new ArrayList<>();
    private final TreeFactory treeFactory;

    public Forest(TreeFactory treeFactory) {
        this.treeFactory = Objects.requireNonNull(treeFactory);
    }

    public void plantTree(
            int x,
            int y,
            String name,
            String color,
            String texture) {
        TreeType type = treeFactory.getTreeType(name, color, texture);
        trees.add(new Tree(x, y, type));
    }

    public void draw() {
        for (Tree tree : trees) {
            tree.draw();
        }
    }

    public int getTreeCount() {
        return trees.size();
    }
}
