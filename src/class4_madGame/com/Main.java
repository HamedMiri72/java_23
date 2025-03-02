package class4_madGame.com;
import java.util.Scanner;
public class Main {

    public static void main(String[] args){

        // MAD LIBS GAME

        Scanner scanner = new Scanner(System.in);



        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.print("Enter an adjective (describing): ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter a noun (animal or person): ");
        noun1 = scanner.nextLine();
        System.out.print("Enter an adjective (describing): ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter a verb ending with ing (action): ");
        verb1 = scanner.nextLine();
        System.out.print("Enter and adjective (describing): ");
        adjective3 = scanner.nextLine();


        System.out.println("\nToday i went to a " + adjective1 + " zoo.");
        System.out.println("In an exhibit, i saw a " + noun1 + ".");
        System.out.println(noun1 + "was " + adjective2 + " and " + verb1 + "!");
        System.out.println("I was " + adjective3 + "!");


        scanner.close();

    }
}
