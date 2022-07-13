package com.nikhil;
// https://leetcode.com/problems/find-the-duplicate-number/
import static com.nikhil.Main.swap;
// Amazon
public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        System.out.println(findDuplicate(arr));
    }

    public static int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i +1) {
                int correct = nums[i] - 1; // index starting form 0
                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else {
                    return nums[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }
}
