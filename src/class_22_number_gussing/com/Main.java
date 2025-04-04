package class_22_number_gussing.com;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);



        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min, max + 1);

        System.out.println("Welcome to number guessing game!");
        System.out.printf("Guess a number between %d-%d\n", min, max);

        do{
            System.out.println("Enter a guss: ");
            guess = scanner.nextInt();
            attempts ++;

            if(guess < randomNumber){
                System.out.println("Too Low try again!");
            }else if(guess > randomNumber){
                System.out.println("To high try again");
            }else{
                System.out.println("Correct! the number was "+ randomNumber);
            }

        }while(guess != randomNumber);
        System.out.println("Number of attempts: " + attempts);

        scanner.close();
    }
}
