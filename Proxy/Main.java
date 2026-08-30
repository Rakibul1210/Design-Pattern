public class Main {
    public static void main(String[] args) {
        Image image = new ImageProxy("vacation-photo.jpg");

        System.out.println("Gallery opened");
        System.out.println("The full image has not been loaded yet.");

        System.out.println();
        System.out.println("First display request:");
        image.display();

        System.out.println();
        System.out.println("Second display request:");
        image.display();
    }
}
