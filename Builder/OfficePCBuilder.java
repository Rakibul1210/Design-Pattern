public class OfficePCBuilder implements PCBuilder {
    private PC pc;

    public OfficePCBuilder() {
        reset();
    }

    @Override
    public void reset() {
        pc = new PC();
    }

    @Override
    public void buildCPU() {
        pc.setCpu("6-core efficiency CPU");
    }

    @Override
    public void buildRAM() {
        pc.setRam("16 GB DDR5");
    }

    @Override
    public void buildStorage() {
        pc.setStorage("512 GB NVMe SSD");
    }

    @Override
    public void buildGraphicsCard() {
        pc.setGraphicsCard("Integrated graphics");
    }

    @Override
    public void buildCoolingSystem() {
        pc.setCoolingSystem("Standard air cooler");
    }

    @Override
    public void buildPowerSupply() {
        pc.setPowerSupply("450 W power supply");
    }

    @Override
    public void buildMonitor() {
        pc.setMonitor("24-inch 1080p 75 Hz monitor");
    }

    @Override
    public PC getResult() {
        PC result = pc;
        reset();
        return result;
    }
}
