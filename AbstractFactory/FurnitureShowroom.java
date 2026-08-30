public class FurnitureShowroom {
    private final Chair chair;
    private final Sofa sofa;
    private final CoffeeTable coffeeTable;

    public FurnitureShowroom(FurnitureFactory factory) {
        chair = factory.createChair();
        sofa = factory.createSofa();
        coffeeTable = factory.createCoffeeTable();
    }

    public void demonstrateFurniture() {
        chair.sitOn();
        sofa.relaxOn();
        coffeeTable.placeCoffee();
    }
}
