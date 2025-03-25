package javadsa.texteditor;

import java.util.Stack;

public class TextEditor {

   private Stack<String> undoStack;
   private Stack<String> redoStack;
   private String text;


   public TextEditor(){
       this.undoStack = new Stack<>();
       this.redoStack = new Stack<>();
       this.text = "";
   }

   //type text and save the undo stack

    public void type(String newText){
       undoStack.push(newText);
       text = newText;
       redoStack.clear();
        System.out.println("Typed: "+ text);
    }

    //undo the last action
    public void undo(){
       if(!undoStack.isEmpty()){
           redoStack.push(text);
           text = undoStack.pop();
           System.out.println("Undo: "+ text);
       } else {
           System.out.println("Nothing to undo!");
       }
    }

    //redo the last undo action
    public void redo(){
       if(!redoStack.isEmpty()){
           undoStack.push(text);
           text = redoStack.pop();
           System.out.println("Redo: " + text);
       }else {
           System.out.println("Nothing to redo!");
       }
    }

    public String getText(){
       return text;
    }

}
