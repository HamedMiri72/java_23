package merge_sorted_array.com;

import java.util.Arrays;

public class Main {

    public static void main(String[] args){


        int[] num1 = {1,2,3,0,0,0};
        int m = 3;
        int[] num2 = {2,5,6};
        int n = 3;



        Solution solution = new Solution();

        solution.merge(num1, m, num2, n);

        System.out.println("Merged Array" + Arrays.toString(num1));



    }



}
