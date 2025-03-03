package class_7_ifstatment.com;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String name;
        int age ;
        boolean isStudent;


        System.out.print("Enter your name: ");
        name = scanner.nextLine();
        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        System.out.print("Are you a student: (true/ false)?");
        isStudent = scanner.nextBoolean();


        //group1
        if(name.isEmpty()){
            System.out.println("You did not enter your name! ");
        }else{
            System.out.println("hello " + name + "!");
        }
        //group 2
        if(age >= 65){
        System.out.println("you are a senior!");
        }
        else if(age >= 18) {
            System.out.println("you are an adult!");

        }else if(age < 0){
            System.out.println("you haven't been born yet!");
        }else if(age == 0){
            System.out.println("You have born today!");
        }
        else{
            System.out.println("You are not an adult!");
        }

        //group3
        if(isStudent){
            System.out.println("you are a Student!");
        }else{
            System.out.println("you are not a student!");
        }

        scanner.close();

    }
}
