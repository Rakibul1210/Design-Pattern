public class BackendServicePipeline extends DeploymentPipeline {
    public BackendServicePipeline(String applicationName) {
        super(applicationName);
    }

    @Override
    protected void runTests() {
        System.out.println("Running unit and integration tests.");
    }

    @Override
    protected String buildArtifact() {
        String artifact = getApplicationName() + ":1.0.0";
        System.out.println("Building container image " + artifact + ".");
        return artifact;
    }

    @Override
    protected void beforeDeploy() {
        System.out.println("Applying backward-compatible database migrations.");
    }

    @Override
    protected boolean requiresApproval() {
        return true;
    }

    @Override
    protected void deployArtifact(String artifact) {
        System.out.println("Rolling out " + artifact + " to the Kubernetes cluster.");
    }

    @Override
    protected void afterDeploy() {
        System.out.println("Enabling production traffic for the new service version.");
    }
}
