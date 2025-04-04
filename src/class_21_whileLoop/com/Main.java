package class_21_whileLoop.com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){


        //while loop : execute some code possibly for ever while the condition remains true

//        Scanner scanner = new Scanner(System.in);
//
//        String name= "";
//
//        while(name.isEmpty()){
//            System.out.print("Enter your name: ");
//            name = scanner.nextLine();
//        }
//
//        //it repeats the code until the condition is no longer true.
//
//        System.out.println("Hello: " + name);
//
//        scanner.close();

        Scanner scanner = new Scanner(System.in);


//        String response = "";
//
//        while(!response.equals("Q")){
//
//            System.out.print("You are playing a game: ");
//            System.out.println("Press Q to quit");
//            response = scanner.next().toUpperCase();
//
//        }
//        System.out.println("You have quit the game");

        int age = 0;

        System.out.print("Enter you age: ");
        age = scanner.nextInt();

        while(age < 0){
            System.out.println("Your age cant be zero!");
            System.out.print("Enter you age: ");
            age = scanner.nextInt();
        }
        System.out.println("You are " + age + "Years old");

        scanner.close();

    }
}
