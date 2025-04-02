package class_20_logicaloperator.com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){


//        double temp = -10;
//        boolean sunny = true;

//
//        if(temp <= 30 && temp >= 0 && sunny){
//            System.out.println("The weather is good!");
//            System.out.println("It is asunny outside!");
//        }else if (temp <= 30 && temp >= 0 && !sunny){
//            System.out.println("The weather is good!");
//            System.out.println("It is cloudy outside!");
//        }else if(temp > 30 || temp < 0){
//            System.out.println("the weather is bad!");
//        }

        Scanner scanner = new Scanner(System.in);

        //username must be between 4-12 character
        //must not contain spaces or underscores

        String username;


        System.out.print("Enter your username: ");
        username = scanner.nextLine();


        if(username.length() < 4 || username.length() > 12 ){
            System.out.println("Username must be between 4 to 12 characters");
        }else if(username.contains("_") || username.contains((" "))){
            System.out.println("Username must not contain spaces or underscores!");
        }
        else{
            System.out.println("welcom " + username);
        }

        scanner.close();
    }
}
