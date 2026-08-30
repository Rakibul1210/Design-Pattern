
class Main {

    public static void main(String[] args) {
        CPU cpu = CPU.getInstance();

        Process p1 = new Process("Process 1");
        Process p2 = new Process("Process 2");
        Process p3 = new Process("Process 3");


        p1.run(CPU.getInstance());
        p2.run(CPU.getInstance());
        p3.run(CPU.getInstance());


    }
}