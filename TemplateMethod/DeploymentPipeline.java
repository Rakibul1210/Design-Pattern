import java.util.Objects;

public abstract class DeploymentPipeline {
    private final String applicationName;

    protected DeploymentPipeline(String applicationName) {
        this.applicationName = Objects.requireNonNull(applicationName);
    }

    public final void run() {
        System.out.println("Starting deployment for " + applicationName + ".");

        checkoutSource();
        runTests();
        String artifact = Objects.requireNonNull(buildArtifact());
        beforeDeploy();

        if (requiresApproval()) {
            requestApproval();
        }

        deployArtifact(artifact);
        verifyDeployment();
        afterDeploy();

        System.out.println("Deployment completed for " + applicationName + ".");
    }

    private void checkoutSource() {
        System.out.println("Checking out the latest source code.");
    }

    protected abstract void runTests();

    protected abstract String buildArtifact();

    protected void beforeDeploy() {
        // Optional hook for subclasses.
    }

    protected boolean requiresApproval() {
        return false;
    }

    private void requestApproval() {
        System.out.println("Deployment approval granted.");
    }

    protected abstract void deployArtifact(String artifact);

    protected void verifyDeployment() {
        System.out.println("Running the standard availability check.");
    }

    protected void afterDeploy() {
        // Optional hook for subclasses.
    }

    protected final String getApplicationName() {
        return applicationName;
    }
}
