import java.util.Objects;

public class InsuranceAgent implements BuildingVisitor {
    private final String name;

    public InsuranceAgent(String name) {
        this.name = Objects.requireNonNull(name);
    }

    @Override
    public void visitResidentialBuilding(ResidentialBuilding building) {
        System.out.println(name + " visits the residence at " + building.getAddress() + ".");
        System.out.println(
                "Offers medical insurance for " + building.getFamilyCount() + " families."
        );
    }

    @Override
    public void visitBank(Bank bank) {
        System.out.println(name + " visits " + bank.getBranchName() + ".");
        System.out.println(
                "Offers theft insurance for $" + bank.getProtectedAssets()
                        + " in protected assets."
        );
    }

    @Override
    public void visitCoffeeShop(CoffeeShop coffeeShop) {
        System.out.println(name + " visits " + coffeeShop.getName() + ".");
        System.out.println("Offers fire and flood insurance.");

        if (coffeeShop.hasKitchen()) {
            System.out.println("Includes additional kitchen fire coverage.");
        }
    }
}
