package leedcode.com.merge_sorted_array;
//
//public class Solution {
//
//    public void merge(int[] num1, int m, int[] num2, int n){
//
//        int midx = m-1;
//        int nidx = n-1;
//        int right = m + n -1;
//
//        while(nidx >= 0){
//            if(midx >= 0 && num1[midx] > num2[nidx]){
//                num1[right] = num1[midx];
//                midx--;
//            }else{
//                num1[right] = num2[nidx];
//                nidx--;
//            }
//            right--;
//        }
//    }
//}

public class Solution{
    public void merge(int[] num1, int m, int[] num2, int n){

        int midx = m-1;
        int nidx = n-1;
        int right = m + n - 1;

        while(nidx >= 0){
            if(midx >= 0 && num1[midx] > num2[nidx]){
                num1[right] = num1[midx];
                midx--;
            }else{
                num1[right] = num2[nidx];
                nidx--;
            }
            right--;
        }

    }
}