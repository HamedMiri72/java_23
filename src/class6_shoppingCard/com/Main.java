package class6_shoppingCard.com;


import java.util.Scanner;

public class Main {

    public static void main( String [] args){

        Scanner scanner = new Scanner(System.in);


        String item;
        double price;
        int numberOfItems;

        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();

        System.out.print("What is the price for each?: ");
        price = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("How many whould you like?: ");
        numberOfItems = scanner.nextInt();
        scanner.nextLine();

        double result = price * numberOfItems;

        System.out.println("\nYou have bought " + numberOfItems + " " + item + "/s");
        System.out.println("Yout total is " + result);


        scanner.close();
    }
}
