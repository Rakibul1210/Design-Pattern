public class Editor {
    private String text;
    private int selectionStart;
    private int selectionEnd;

    public Editor(String text) {
        setText(text);
    }

    public void select(int start, int end) {
        if (start < 0 || end < start || end > text.length()) {
            throw new IndexOutOfBoundsException("Invalid selection range");
        }

        selectionStart = start;
        selectionEnd = end;
    }

    public String getSelection() {
        return text.substring(selectionStart, selectionEnd);
    }

    public void deleteSelection() {
        text = text.substring(0, selectionStart)
                + text.substring(selectionEnd);
        selectionEnd = selectionStart;
    }

    public void replaceSelection(String replacement) {
        if (replacement == null) {
            throw new IllegalArgumentException("Replacement text is required");
        }

        text = text.substring(0, selectionStart)
                + replacement
                + text.substring(selectionEnd);
        selectionStart += replacement.length();
        selectionEnd = selectionStart;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        if (text == null) {
            throw new IllegalArgumentException("Editor text is required");
        }

        this.text = text;
        selectionStart = text.length();
        selectionEnd = text.length();
    }
}
