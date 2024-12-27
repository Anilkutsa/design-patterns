package org.designpatterns.behavioural.memento;

/** A text editor where the user can undo changes, such as text addition, deletion,
 or formatting. The editor stores snapshots of its state (text content)
 after each change, enabling the user to revert to previous states.
 */
public class TextEditorOriginator {
    private String content;

    public void write(String text){
        this.content = text;
        System.out.println("State set to: " + content);
    }

    //Save the current state of editor
    public EditorMemento save(){
        return new EditorMemento(content);
    }

    //Restore (Memento->update the state of current content)
    public void restore(EditorMemento memento){
        content = memento.getContent();
        System.out.println("State restored to: " + content);
    }

    public String getContent(){
        return content;
    }
}
