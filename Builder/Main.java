public class Main {
    public static void main(String[] args) {
        PCDirector director = new PCDirector();

        PC gamingPC = director.buildPC(new GamingPCBuilder());
        PC officePC = director.buildPC(new OfficePCBuilder());

        System.out.println("--- Gaming PC ---");
        gamingPC.displayConfiguration();

        System.out.println();
        System.out.println("--- Office PC ---");
        officePC.displayConfiguration();
    }
}
