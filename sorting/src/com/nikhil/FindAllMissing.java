package com.nikhil;
// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
import java.util.ArrayList;
import java.util.List;
// Google
import static com.nikhil.Main.swap;

public class FindAllMissing {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> result = missingNumber(nums);
        System.out.println(result);

    }
    public static List<Integer> missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1; // index starting form 0
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        // just find missing number
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                ans.add(index + 1);
            }
        }
        return ans;
    }
}



