package javadsa.texteditor;

public class Main {

    public static void main(String[] args){
        TextEditor textEditor = new TextEditor();

        textEditor.type("hello");
        textEditor.type("Hello, World!");
        textEditor.type("Hello, World! How are you?");


        textEditor.undo();
        textEditor.undo();
        textEditor.redo();

        System.out.println("Final text" + textEditor.getText());
    }
}
