public class Main {
    public static void main(String[] args) {
        Folder project = new Folder("Design-Pattern");
        Folder compositePattern = new Folder("Composite");
        Folder diagrams = new Folder("diagrams");

        compositePattern.add(new FileItem("Main.java", 1_200));
        compositePattern.add(new FileItem("Folder.java", 1_800));
        compositePattern.add(new FileItem("FileItem.java", 900));
        diagrams.add(new FileItem("composite.png", 2_400));

        project.add(new FileItem("README.md", 500));
        project.add(compositePattern);
        project.add(diagrams);

        project.display("");
        System.out.println();
        System.out.println("Total project size: " + project.getSize() + " bytes");
    }
}
