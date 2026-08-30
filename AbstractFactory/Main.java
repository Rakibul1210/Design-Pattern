public class Main {
    public static void main(String[] args) {
        demonstrateCollection("Victorian", new VictorianFurnitureFactory());
        demonstrateCollection("Modern", new ModernFurnitureFactory());
    }

    private static void demonstrateCollection(
            String collectionName,
            FurnitureFactory factory) {
        System.out.println("--- " + collectionName + " collection ---");

        FurnitureShowroom showroom = new FurnitureShowroom(factory);
        showroom.demonstrateFurniture();

        System.out.println();
    }
}
