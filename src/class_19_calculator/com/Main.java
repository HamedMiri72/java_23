package class_19_calculator.com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result = 0;
        boolean validOperation = true;


        System.out.print("Enter your first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter the secont number: ");
        num2 = scanner.nextDouble();

        System.out.print("Which operater would you like to use (+ - / * ^ ):  ");
        operator = scanner.next().charAt(0);


        switch(operator){
            case '+' -> result = num2 + num1;
            case '-' -> result = num1 - num2;
            case '/' -> {
                if(num2 == 0){
                    System.out.println("Can not divide by 0!");
                    validOperation = false;
                }else{
                    result = num1 / num2;
                }
            }
            case '*' -> result = num1 * num2;
            case '^' -> result = Math.pow(num1, num2);
            default -> {
                System.out.println("Invalid operator!");
                validOperation = false;
            }

        }

        if(validOperation) {
            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        }

        scanner.close();
    }
}
