package javadsa.stackImp;

public class CustomeStackTest{
    public static void main(String[] args){
        CustomeStack stack = new CustomeStack(5);


        stack.push(5);
        stack.push(10);
        stack.push(15);

        stack.printStack();  // Print the stack after push

        System.out.println("Top element: " + stack.peek());

        System.out.println("Popped: " + stack.pop());
        stack.printStack();  // Print stack after pop
        System.out.println("Popped: " + stack.pop());
        stack.printStack();  // Print stack after second pop

        System.out.println("Top element after popping: " + stack.peek());
    }


}

