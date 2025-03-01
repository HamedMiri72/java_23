package class2.com;

public class Main {

    public static void main(String[] args){


        // ❎ variable = A reusable container for a value.
        //                          A variable behaves as if it was the value it contains.

        // 🟥 Primitive = simple value stored directly in memory (stack)
        // 🟦 Reference = memory address (stack) that points to the (heap)

        // 🟥 Primitive vs 🟦 Reference
        //    ---------                      ---------
        //    int                           string
        //    double                    array
        //    char                        object
        //    boolean

        //2 step to creating a variable
        //----------------------------
        //1. declaration
        //2. assignment

        int age = 21;
        int year = 2025;
        int quantity = 1;

        System.out.println(age);
        System.out.println("the year is " + year);
        System.out.println(quantity);


        double price = 19.99;
        double gpa = 3.5;
        double tempreture = 12;

        System.out.println("$" + price);
        System.out.println(tempreture);

        char grade = 'A';
        char symbol = '!';
        char currency = '$';


        System.out.println(grade);

        boolean isStudent = false;
        boolean forSale = false;
        boolean isOnline = true;


        System.out.print(isStudent);
        System.out.println(forSale);
        System.out.println(isOnline);

        if(isStudent){
            System.out.println("you have a big chance");
        }else{
            System.out.println("you are not a student!");
        }


        //String
        String name = "hamed";
        String lastName = "miri";
        String food = "pizza";
        String email = "facke123@email.com";
        String color = "blue";
        String car = "benz";

        System.out.println("hello " + name);
        System.out.println("youtr favorite food is " + food);
        System.out.println("your email is " + email);

        System.out.println("You are" + age + "years old");
        System.out.println("your gpa is " + gpa);
        System.out.println("your average letter grade is " + grade);


        System.out.println("your chice is a " + color + " "+ year + " " + car);
        System.out.println("The price is: " + currency + " " + price);

        if(forSale){
            System.out.println("There is a " + car + "for sale");
        }else{
            System.out.println("the " + car + " is not for sale");
        }

    }
}
