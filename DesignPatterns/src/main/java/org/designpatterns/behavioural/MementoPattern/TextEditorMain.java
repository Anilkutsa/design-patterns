package org.designpatterns.behavioural.MementoPattern;

/**
 * The Memento Pattern is a behavioral design pattern that helps us save and restore the state of an object without exposing its internal details. Think of it like a "Save Game" feature in video games, where you can save your progress and later go back to that saved point.
 *
 * How it Works:
 * Originator: This is the object whose state you want to save and restore. It creates a "memento" to save its state and can use that memento to restore its state.
 * Memento: This is a snapshot of the Originator's state. It stores the state but doesn't allow external classes to modify it.
 * Caretaker: This manages the mementos. It asks the Originator to save its state in a memento and later uses the memento to restore the Originator's state.
 */
public class TextEditorMain {

    public static void main(String[] args) {

        TextEditorOriginator editor = new TextEditorOriginator();
        Caretaker caretaker = new Caretaker(); //History / StateMgmt

        editor.write("A");
        caretaker.saveState(editor);

        editor.write("B");
        caretaker.saveState(editor);

        //Problem - > Undo the last write!
        editor.write("C");
        caretaker.saveState(editor);

        //CareTaker Undo
        caretaker.undo(editor);

        //CareTaker Undo
        caretaker.undo(editor);

        System.out.println(editor.getContent());
    }
}