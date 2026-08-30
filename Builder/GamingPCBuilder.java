public class GamingPCBuilder implements PCBuilder {
    private PC pc;

    public GamingPCBuilder() {
        reset();
    }

    @Override
    public void reset() {
        pc = new PC();
    }

    @Override
    public void buildCPU() {
        pc.setCpu("12-core performance CPU");
    }

    @Override
    public void buildRAM() {
        pc.setRam("32 GB DDR5");
    }

    @Override
    public void buildStorage() {
        pc.setStorage("2 TB NVMe SSD");
    }

    @Override
    public void buildGraphicsCard() {
        pc.setGraphicsCard("High-end dedicated graphics card");
    }

    @Override
    public void buildCoolingSystem() {
        pc.setCoolingSystem("360 mm liquid cooler");
    }

    @Override
    public void buildPowerSupply() {
        pc.setPowerSupply("850 W power supply");
    }

    @Override
    public void buildMonitor() {
        pc.setMonitor("27-inch 1440p 165 Hz monitor");
    }

    @Override
    public PC getResult() {
        PC result = pc;
        reset();
        return result;
    }
}
