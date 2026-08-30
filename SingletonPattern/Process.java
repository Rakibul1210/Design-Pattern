public class Process {
        private String name;

        public Process(String name) {
                this.name = name;
        }

        public String getName() {
                return name;
        }

        public void run(CPU cpu) {
                System.out.println(this.name + " process is running");
        }
}