public class Main {
    public static void main(String[] args) {
        TreeFactory treeFactory = new TreeFactory();
        Forest forest = new Forest(treeFactory);

        forest.plantTree(10, 20, "Oak", "Green", "oak.png");
        forest.plantTree(30, 40, "Oak", "Green", "oak.png");
        forest.plantTree(70, 80, "Oak", "Green", "oak.png");
        forest.plantTree(50, 60, "Pine", "Dark Green", "pine.png");
        forest.plantTree(90, 20, "Pine", "Dark Green", "pine.png");

        forest.draw();

        System.out.println();
        System.out.println("Tree objects: " + forest.getTreeCount());
        System.out.println(
                "Shared TreeType objects: "
                        + treeFactory.getCreatedTypeCount());
    }
}
