public class Main {
    public static void main(String[] args) {
        DeploymentPipeline backendPipeline = new BackendServicePipeline("orders-service");
        DeploymentPipeline websitePipeline = new StaticWebsitePipeline("documentation-site");

        System.out.println("--- Backend service ---");
        backendPipeline.run();

        System.out.println("\n--- Static website ---");
        websitePipeline.run();
    }
}
