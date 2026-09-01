import java.util.Objects;

public class CoffeeShop implements Building {
    private final String name;
    private final boolean hasKitchen;

    public CoffeeShop(String name, boolean hasKitchen) {
        this.name = Objects.requireNonNull(name);
        this.hasKitchen = hasKitchen;
    }

    public String getName() {
        return name;
    }

    public boolean hasKitchen() {
        return hasKitchen;
    }

    @Override
    public void accept(BuildingVisitor visitor) {
        Objects.requireNonNull(visitor).visitCoffeeShop(this);
    }
}
