package leedcode.RemoveElement;


public class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // تعداد عناصر غیر val

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; // جابجا کردن مقدارهای غیر val
                k++;
            }
        }

        return k; // تعداد عناصر باقی‌مانده
    }
}

