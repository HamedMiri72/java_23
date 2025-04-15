package class_23_forLoop.com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

//        for(int i = 0; i < 10; i++ ){
//
//            System.out.println(i);
//
//        }

//        for(int i=10; i>0; i--){
//            System.out.println(i);
//        }

//        for(int i= 0; i<= 10; i +=2){
//            System.out.println(i);
//        }

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter how many times you want to loop: ");
//
//        int max = scanner.nextInt();
//
//        for(int i = 0; i < max; i++){
//            System.out.println(i);
//        }
//
//
//        scanner.close();

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("How many seconds to countdown from?");
//        int start = scanner.nextInt();
//
//
//        for(int i = start; i > 0; i--){
//            System.out.println(i);
//            Thread.sleep(1000);
//        }
//        System.out.println("Happy New Year");


        //break -> break out of a loop (STOP)
        //continue -> skip current iteration of a loop (SKIP)


        for(int i=0; i<10; i++){
//            if( i == 5) {
//                break;
//            }
            if(i==7){
                continue;
            }
            System.out.println(i + " ");
        }

    }
}
