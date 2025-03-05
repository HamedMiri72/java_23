package class_14_substring.com;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        //substring // extract a portion of a string

        Scanner scanner = new Scanner(System.in);

        String email;
        String username;
        String domain;



        System.out.print("Enter your email: ");
        email = scanner.nextLine();

        if(email.contains("@") && !email.isEmpty()){

            username = email.substring(0, email.indexOf("@"));

            domain = email.substring(email.indexOf("@") + 1);

            System.out.println(username);
            System.out.println(domain);

        }else{
            System.out.println("email must contains @");
        }



        scanner.close();
    }

}
