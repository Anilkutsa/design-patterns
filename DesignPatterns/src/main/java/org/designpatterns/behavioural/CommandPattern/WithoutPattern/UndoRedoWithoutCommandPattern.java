package org.designpatterns.behavioural.CommandPattern.WithoutPattern;

import java.util.Stack;

/**
 * Drawback:
 * - All logic is directly embedded in the TextEditor class, making it harder to extend or reuse.
 * - Adding new actions (like formatting text) would require modifying the TextEditor class.
 */

// Receiver
class TextEditor {
    private StringBuilder content = new StringBuilder();
    private Stack<String> history = new Stack<>();

    public void addText(String text) {
        history.push(content.toString()); // Save the current state
        content.append(text);
        System.out.println("Current Content: " + content);
    }

    public void undo() {
        if (!history.isEmpty()) {
            content = new StringBuilder(history.pop());
            System.out.println("Undo Operation: " + content);
        }
    }
}

// Main
public class UndoRedoWithoutCommandPattern {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        editor.addText("Hello "); // Current Content: Hello
        editor.addText("World!"); // Current Content: Hello World!
        editor.undo();            // Undo Operation: Hello
        editor.undo();            // Undo Operation:
    }
}