package class_18_enhancedSwitches.com;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){


        Scanner scanner  = new Scanner(System.in);

        String day;

        System.out.print("Enter a day of the week: ");
        day = scanner.next();


//        switch (day){
//            case "Monday" -> System.out.println("It is a week day");
//            case "Tusday" -> System.out.println("It is a week day");
//            case "Wednsday" -> System.out.println("It is a week day");
//            case "Thursday" -> System.out.println("It is a week day");
//            case "Friday" -> System.out.println("IT is a week day");
//            case "Sunday" -> System.out.println("It is the weekend");
//            default -> System.out.println(day + "It is not a day");
//        }

        switch (day){
            case "Monday", "Tusday", "Wednsday", "Thursday", "Friday" ->
                    System.out.println("IT is a week day");
            case "Sunday" ->
                    System.out.println("It is the weekend");
            default ->
                    System.out.println(day + "It is not a day");
        }

        scanner.close();
    }
}
