public class StaticWebsitePipeline extends DeploymentPipeline {
    public StaticWebsitePipeline(String applicationName) {
        super(applicationName);
    }

    @Override
    protected void runTests() {
        System.out.println("Running link, accessibility, and style checks.");
    }

    @Override
    protected String buildArtifact() {
        String artifact = "dist/" + getApplicationName();
        System.out.println("Generating optimized static files in " + artifact + ".");
        return artifact;
    }

    @Override
    protected void deployArtifact(String artifact) {
        System.out.println("Uploading " + artifact + " to object storage.");
    }

    @Override
    protected void afterDeploy() {
        System.out.println("Invalidating the CDN cache.");
    }
}
