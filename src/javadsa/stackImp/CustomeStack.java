package javadsa.stackImp;

public class CustomeStack {

    private int maxSize;
    private int top;
    private int[] stackArray;


    public CustomeStack(int size){
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    //push operation
    public void push(int value){
        if(top == maxSize - 1){
            System.out.println("Stack overflow! can not push"+ value);
        }
        stackArray[++top] = value;
        System.out.println("Pushed: " + value);

    }

    //pop operation
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        int removalValue = stackArray[top];
        stackArray[top] = 0;
        top--;
        return removalValue;
    }

    //peek
    public int peek(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return -1;
        }
        return stackArray[top];
    }


    //check if stack is empty
    public boolean isEmpty(){
        return (top == -1);
    }

    public void printStack(){
        System.out.println("Stack: ");
        for(int i = 0; i<= top; i++){
            System.out.println(stackArray[i] + "");
        }
        System.out.println();
    }



}

