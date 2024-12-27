package org.designpatterns.behavioural.CommandPattern.WithoutPattern;

/**
 * Imagine you're developing a basic text editor with buttons for bold, italic, and underline text formatting.
 * <p>
 * Without the Command Pattern, the buttons directly interact with the TextEditor class,
 * and you’d end up hardcoding behavior into the UI classes, making them tightly coupled.
 * <p>
 * Drawbacks
 * - Each button class is tightly coupled with the TextEditor. If the action changes, all button classes need to be modified.
 * - It's harder to extend with new commands or add functionality such as undo/redo or logging.
 *
 */

class TextEditor2 {
    public void boldText() {
        System.out.println("Text has been bolded.");
    }

    public void italicizeText() {
        System.out.println("Text has been italicized.");
    }

    public void underlineText() {
        System.out.println("Text has been underlined.");
    }
}

//UI Button Classes
class BoldButton {
    private TextEditor2 editor;

    public BoldButton(TextEditor2 editor) {
        this.editor = editor;
    }

    public void click() {
        editor.boldText();
    }
}

class ItalicButton {
    private TextEditor2 editor;

    public ItalicButton(TextEditor2 editor) {
        this.editor = editor;
    }

    public void click() {
        editor.italicizeText();
    }
}

public class HighlightTextInEditor {
    public static void main(String[] args) {
        TextEditor2 editor = new TextEditor2();
        BoldButton boldButton = new BoldButton(editor);
        ItalicButton italicButton = new ItalicButton(editor);
        boldButton.click();
        italicButton.click();
    }
}
