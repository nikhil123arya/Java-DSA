package com.nikhil;
// Amazon
// https://leetcode.com/problems/missing-number/
import static com.nikhil.Main.swap;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = { 1, 0, 4, 2};
        System.out.println(missingNumber(nums));
    }

    static int missingNumber(int[] nums) {
            int i = 0;
            while (i < nums.length) {
                int correct = nums[i]; // index starting form 0
                if (nums[i] < nums.length && nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else {
                    i++;
                }
            }
            // search for the missing number

            for (int index = 0; index < nums.length ; index++) {
                if (nums[index] != index) {
                    return index;
                }
            }
            // case 2
            return nums.length;
    }
 }

