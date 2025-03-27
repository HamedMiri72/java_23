package leedcode.RemoveElement;

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Solution remove = new Solution();

        int[] nums = {3,2,2,3};
        int val = 3;

        int k = remove.removeElement(nums, val);

        // چاپ خروجی مورد نظر
        System.out.print("Output: " + k + ", nums = [");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + (i < k - 1 ? "," : ""));
        }
        for (int i = k; i < nums.length; i++) {
            System.out.print(",_");
        }
        System.out.println("]");
    }
}


