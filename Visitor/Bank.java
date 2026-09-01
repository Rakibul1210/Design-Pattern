import java.util.Objects;

public class Bank implements Building {
    private final String branchName;
    private final long protectedAssets;

    public Bank(String branchName, long protectedAssets) {
        if (protectedAssets < 0) {
            throw new IllegalArgumentException("Protected assets cannot be negative.");
        }

        this.branchName = Objects.requireNonNull(branchName);
        this.protectedAssets = protectedAssets;
    }

    public String getBranchName() {
        return branchName;
    }

    public long getProtectedAssets() {
        return protectedAssets;
    }

    @Override
    public void accept(BuildingVisitor visitor) {
        Objects.requireNonNull(visitor).visitBank(this);
    }
}
