public interface PCBuilder {
    void reset();

    void buildCPU();

    void buildRAM();

    void buildStorage();

    void buildGraphicsCard();

    void buildCoolingSystem();

    void buildPowerSupply();

    void buildMonitor();

    PC getResult();
}
