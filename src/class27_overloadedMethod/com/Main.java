package class27_overloadedMethod.com;

public class Main {

    public static void main(String[] args){

        //methods that share the same name but different parameters
        //signature = name + parameters

//        System.out.println(add(3 , 4));
//        System.out.println(add(1, 2, 3));

        String pizza;
        pizza = bakePizza("tomato");
        System.out.println(pizza);

        System.out.println(bakePizza("flat bread", "mozzarella"));

        System.out.println(bakePizza("flat bread", "mozzarella", "peperoni"));

    }

    static String bakePizza(String bread){

        return bread + "pizza";

    }

    static String bakePizza(String bread, String cheeze){

        return bread + cheeze + " " + "pizza";
    }

    static String bakePizza(String bread, String cheeze, String topping){

        return topping  + " " + cheeze + " " + bread + "pizza";
    }

//    static double add(double a, double b){
//
//        return a + b;
//
//    }
//
//    static double add(double a, double b, double c){
//        return a + b + c;
//    }
}
