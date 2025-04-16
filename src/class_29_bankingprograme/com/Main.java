package class_29_bankingprograme.com;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){




        // Declare variables

        double balance = 0;
        boolean running = true; // continue this program while running is true
        int choice;

        while (running){
            //display a menu
            System.out.println("Banking Program");

            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");


            // get and process user choice
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();


            switch (choice){
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> running = false;
                default -> System.out.println("INVALID CHOICE");
            }
        }


        //showBalance()


        //deposit


        //withdraw

        //exit message

        scanner.close();

    }

    static void showBalance(double balance){

        System.out.printf("$%.2f\n", balance);

    }

    static double deposit(){

        double amount;
        System.out.print("Enter a amount to be deposited: ");
        amount = scanner.nextDouble();

        if(amount < 0){
            System.out.println("amount cant be negetive");
            return 0;
        }else{

            return amount;

        }
    }

    static double withdraw(double balance){

        double amount;

        System.out.print("Enter a withdraw amount: ");
        amount = scanner.nextDouble();

        if(amount< 0 ){
            System.out.println("amount can not be less than zero");
            return 0;
        }else if(amount > balance){
            System.out.println("amount can not be more than balance");
            return 0;
        }
        else{
            return amount;
        }
    }


}
