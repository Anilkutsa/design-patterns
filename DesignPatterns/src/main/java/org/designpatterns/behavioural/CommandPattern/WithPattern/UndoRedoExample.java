package org.designpatterns.behavioural.CommandPattern.WithPattern;

import java.util.Stack;

// TECommand Interface
interface TECommand {
    void execute();
    void undo();
}

// Concrete TECommand for typing
class TypeTECommand implements TECommand {
    private TextEditor editor;
    private String text;

    public TypeTECommand(TextEditor editor, String text) {
        this.editor = editor;
        this.text = text;
    }

    @Override
    public void execute() {
        editor.addText(text);
    }

    @Override
    public void undo() {
        editor.removeText(text);
    }
}

// Receiver
class TextEditor {
    private StringBuilder content = new StringBuilder();

    public void addText(String text) {
        content.append(text);
        System.out.println("Current Content: " + content);
    }

    public void removeText(String text) {
        int start = content.length() - text.length();
        content.delete(start, content.length());
        System.out.println("Current Content: " + content);
    }
}

// Invoker
class TECommandManager {
    private Stack<TECommand> TECommandStack = new Stack<>();

    public void executeTECommand(TECommand TECommand) {
        TECommand.execute();
        TECommandStack.push(TECommand);
    }

    public void undo() {
        if (!TECommandStack.isEmpty()) {
            TECommand TECommand = TECommandStack.pop();
            TECommand.undo();
        }
    }
}

// Main
public class UndoRedoExample {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        TECommandManager manager = new TECommandManager();

        TECommand typeHello = new TypeTECommand(editor, "Hello ");
        TECommand typeWorld = new TypeTECommand(editor, "World!");

        manager.executeTECommand(typeHello); // Current Content: Hello
        manager.executeTECommand(typeWorld); // Current Content: Hello World!
        manager.undo();                    // Current Content: Hello
    }
}
