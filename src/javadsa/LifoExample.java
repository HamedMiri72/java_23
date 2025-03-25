package javadsa;

import java.util.Stack;

public class LifoExample {

    public static void main(String[] args){

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);


        System.out.println("Stack after push: "+ stack);

        //pooping elements
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());

        //peek at the top element without removingit

        System.out.println("Peek: " + stack.peek());

        System.out.println("final stack: " + stack);


    }
}
