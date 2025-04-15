package class26_methods.com;

public class Main {

    public static void main(String[] args){


        String name = "Hamed";
        int age = 32;

        happyBirthday(name, age);
        double result = square(3);
        System.out.println(result);

        double cube = cube(3);
        System.out.println(cube);

        String fullName = crateName("hamed", "miri");
        System.out.println("Full name is : " + fullName);

        if(ageCheck(age)){

            System.out.println("you are greater than 18");
        }

    }

    //outside the main method we crate a method

    //since we call the method from another method(main) that is static we need to call it static

    static void happyBirthday(String name, int age){
        System.out.println("happy birthday to you");
        System.out.printf("happy birthday dear %s\n", name);
        System.out.printf("You are %d years old!\n", age);
        System.out.println("Happy birthday to you!\n");
    }

    static double square(double number){
        return number * number;
    }

    static double cube(double number){
        return Math.pow(number, 3);
    }

    static String crateName(String fristName, String lastName){
        return fristName+ " " + lastName;
    }

    static Boolean ageCheck(int age){
        return age >= 18;
    }

}
