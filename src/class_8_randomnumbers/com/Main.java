package class_8_randomnumbers.com;
import java.util.Random;

public class Main {
    public static void main(String[] args){

        Random random = new Random();

        int number1;
        int number2;
        int number3;
        double number4;
        boolean isHead;


        number1 = random.nextInt(1, 7);
        number2 = random.nextInt(1,7);
        number3 = random.nextInt(1, 7);
        number4 = random.nextDouble(); // a random number between 0 and 1
        isHead = random.nextBoolean();

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);
        System.out.println(isHead);

        if(isHead){
            System.out.println("heads");
        }else{
            System.out.println("tails");
        }

    }
}
