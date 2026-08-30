public class PC {
    private String cpu;
    private String ram;
    private String storage;
    private String graphicsCard;
    private String coolingSystem;
    private String powerSupply;
    private String monitor;

    void setCpu(String cpu) {
        this.cpu = cpu;
    }

    void setRam(String ram) {
        this.ram = ram;
    }

    void setStorage(String storage) {
        this.storage = storage;
    }

    void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    void setCoolingSystem(String coolingSystem) {
        this.coolingSystem = coolingSystem;
    }

    void setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
    }

    void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public void displayConfiguration() {
        System.out.println("CPU: " + cpu);
        System.out.println("RAM: " + ram);
        System.out.println("Storage: " + storage);
        System.out.println("Graphics: " + graphicsCard);
        System.out.println("Cooling: " + coolingSystem);
        System.out.println("Power supply: " + powerSupply);
        System.out.println("Monitor: " + monitor);
    }
}
