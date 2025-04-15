package class25_nestedLoop.com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        //nested loop a loop inside another loop


//        for(int i =0; i <= 2; i++){
//            for(int j = 1; j<=10; j++){
//                System.out.print(j + " ");
//            }
//        }

        Scanner scanner = new Scanner(System.in);

        int rows;
        int columns;
        char symbol;

        System.out.print("Enter the number of rows of matrix: ");
        rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        columns = scanner.nextInt();

        System.out.print("Enter the symbol to use: ");
        symbol = scanner.next().charAt(0);

        for(int i = 0; i < rows; i++){
            for(int j = 0; j<columns; j++){
                System.out.print(symbol);
            }
            System.out.println();
        }

        scanner.close();
    }
}
