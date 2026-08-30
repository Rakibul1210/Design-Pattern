public class Main {
    public static void main(String[] args) {
        cloneWithoutRegistry();
        cloneWithRegistry();
    }

    private static void cloneWithoutRegistry() {
        System.out.println("--- Without registry ---");

        Troop barbarianPrototype = new Barbarian(5, 150, 30);

        Troop firstBarbarian = barbarianPrototype.cloneTroop();
        Troop secondBarbarian = barbarianPrototype.cloneTroop();

        firstBarbarian.deployAt(2, 5);
        secondBarbarian.deployAt(4, 7);

        firstBarbarian.display();
        secondBarbarian.display();

        System.out.println();
    }

    private static void cloneWithRegistry() {
        System.out.println("--- With registry ---");

        TroopRegistry registry = new TroopRegistry();

        registry.registerPrototype(
                TroopType.BARBARIAN,
                new Barbarian(5, 150, 30));
        registry.registerPrototype(
                TroopType.ARCHER,
                new Archer(5, 80, 40));
        registry.registerPrototype(
                TroopType.GIANT,
                new Giant(5, 500, 20));

        Troop barbarian = registry.createTroop(TroopType.BARBARIAN);
        Troop archer = registry.createTroop(TroopType.ARCHER);
        Troop giant = registry.createTroop(TroopType.GIANT);

        barbarian.deployAt(3, 6);
        archer.deployAt(6, 4);
        giant.deployAt(8, 3);

        barbarian.display();
        archer.display();
        giant.display();
    }
}
