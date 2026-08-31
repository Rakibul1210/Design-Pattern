public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor("Hello Command Pattern");
        Application application = new Application(editor);

        System.out.println("Original: " + editor.getText());

        editor.select(6, 13);
        application.executeCommand(new CopyCommand(application, editor));
        System.out.println("Clipboard after copy: " + application.getClipboard());

        editor.select(14, 21);
        application.executeCommand(new PasteCommand(application, editor));
        System.out.println("After paste: " + editor.getText());

        application.executeCommand(new UndoCommand(application, editor));
        System.out.println("After undoing paste: " + editor.getText());

        editor.select(6, 14);
        application.executeCommand(new CutCommand(application, editor));
        System.out.println("After cut: " + editor.getText());

        application.executeCommand(new UndoCommand(application, editor));
        System.out.println("After undoing cut: " + editor.getText());
    }
}
