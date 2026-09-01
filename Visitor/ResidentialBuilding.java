import java.util.Objects;

public class ResidentialBuilding implements Building {
    private final String address;
    private final int familyCount;

    public ResidentialBuilding(String address, int familyCount) {
        if (familyCount < 1) {
            throw new IllegalArgumentException("A residential building needs a family.");
        }

        this.address = Objects.requireNonNull(address);
        this.familyCount = familyCount;
    }

    public String getAddress() {
        return address;
    }

    public int getFamilyCount() {
        return familyCount;
    }

    @Override
    public void accept(BuildingVisitor visitor) {
        Objects.requireNonNull(visitor).visitResidentialBuilding(this);
    }
}
