package org.designpatterns.behavioural.memento;

import java.util.Stack;

//Caretaker Class: Manage mementos (snapshots of the TextEditorOriginator state)
public class Caretaker {
    private final Stack<EditorMemento> history = new Stack<>();

    public void saveState(TextEditorOriginator editor){
        history.push(editor.save());
    }

    public void undo(TextEditorOriginator editor){
        if(!history.empty()){
            history.pop();
            editor.restore(history.peek());
        }
    }
}
