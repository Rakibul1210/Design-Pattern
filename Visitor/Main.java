import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Building> neighborhood = Arrays.asList(
                new ResidentialBuilding("17 Lake Road", 12),
                new Bank("Central Bank - North Branch", 5_000_000),
                new CoffeeShop("Morning Brew", true)
        );

        BuildingVisitor agent = new InsuranceAgent("Amina");

        for (Building building : neighborhood) {
            building.accept(agent);
            System.out.println();
        }
    }
}
