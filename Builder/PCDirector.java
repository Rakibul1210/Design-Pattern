public class PCDirector {
    public PC buildPC(PCBuilder builder) {
        builder.reset();
        builder.buildCPU();
        builder.buildRAM();
        builder.buildStorage();
        builder.buildGraphicsCard();
        builder.buildCoolingSystem();
        builder.buildPowerSupply();
        builder.buildMonitor();
        return builder.getResult();
    }
}
