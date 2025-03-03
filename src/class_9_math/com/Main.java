package class_9_math.com;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){


//        System.out.println(Math.PI);
//        System.out.println(Math.E);
//
//        double result;
//        result = Math.pow(2, 3);
//        System.out.println(result);
//
//        result = Math.abs(-5);
//        System.out.println(result);
//
//        result = Math.sqrt(9);
//        System.out.println(result);
//
//        result = Math.round(3.14);
//        System.out.println(result);
//
//        result = Math.ceil(3.14);
//        System.out.println(result);
//
//        result = Math.floor(3.99);
//        System.out.println(result);
//
//        result = Math.max(10, 20);
//        System.out.println(result);
//
//        result = Math.min(10, 20);
//        System.out.println(result);




        // HYPOTENUSE C = Math.sqrt(a^2 + b^

        Scanner scanner = new Scanner(System.in);

//        double a;
//        double b;
//        double c;
//        double addition;
//
//        System.out.print("Enter a: ");
//        a = scanner.nextDouble();
//
//        System.out.print("Enter b: ");
//        b = scanner.nextDouble();
//
//        addition = Math.pow(a, 2) + Math.pow(b, 2);
//        c = Math.sqrt(addition);
//
//        System.out.println("result is "  + c + " cm");

        //circumference = 2 pi r;
        //are = pi r**2;
        //3/4 p r**3

        double radius;
        double area;
        double circumference;
        double volume;

        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();

        area = Math.PI * (Math.pow(radius, 2));
        circumference = 2 * Math.PI * radius;
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.println("you crated a circule whith radius " + radius + " area " + area + " circumference " + circumference + " volume " + volume);
        System.out.printf("You created a circle with radius %.1f, area %.1f, circumference %.1f, volume %.1f%n",
                radius, area, circumference, volume);




        scanner.close();
    }
}
