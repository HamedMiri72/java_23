package class3_scanner.com;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

//        Scanner scanner = new Scanner(System.in);


        // common issues when we accept an integer and a string after each other
//        System.out.print("Enter your age: ");
//        int age = scanner.nextInt();
//        scanner.nextLine();
//
//        System.out.print("What is your favorite color: ");
//        String color = scanner.nextLine();
//
//        System.out.println("you are " + age + "years old");
//        System.out.println("you like the color " + color);
////
//        System.out.print("Enter your name: ");
//        String name = scanner.nextLine();
//
//        System.out.print("Enter your age: ");
//        int age = scanner.nextInt();
//
//        System.out.print("how much you worth: ");
//        double price = scanner.nextDouble();
//
//        System.out.print("Are you a student: (true/ false)");
//        boolean isStudent = scanner.nextBoolean();
//
//        System.out.println("Hello " + name);
//        System.out.println("You are " + age + "years old");
//        System.out.println("you worth: " + "$ " + price);
//        System.out.println("student: "+ isStudent);
//
//        if(isStudent){
//
//            System.out.println("you are enrolled as a student");
//
//        }else{
//            System.out.println("you are not enrolled as a student");
//        }
//        scanner.close();


        //calculate the area of rectangle
        double width = 0;
        double height = 0;
        double area = 0;


        Scanner scanner1 = new Scanner(System.in);

        System.out.print("Enter the Width: ");
        width = scanner1.nextDouble();

        System.out.print("Enter the height: ");
        height = scanner1.nextDouble();

        area = width * height;

        System.out.println("the area is: "+ area + "cm^2");







        scanner1.close();

    }
}
