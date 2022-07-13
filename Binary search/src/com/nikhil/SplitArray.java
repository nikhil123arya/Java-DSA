package com.nikhil;

public class SplitArray {
    public static void main(String[] args) {
        int[] nums = {7, 2, 5, 8, 10};
        System.out.println(splitArray(nums,2));
    }
    public static int splitArray(int[] nums, int m) {
        int start = 0;
        int end = nums.length - 1;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);
            end+= nums[i];
        }

        // binary searh
        while (start < end) {
            // try to find middle as a potential answer
            int mid = start + (end - start) / 2;

            // calculate in how many pieces you can divide this in with max sum
            int sum = 0;
            int pieces = 1;
            for (int num : nums) {
                if (sum + num > mid) {
                    // you can not add this in this sub array, make a new one
                    sum = num;
                    pieces ++;
                } else {
                    sum += num;
                }
            }

            if (pieces > m) {
                start = mid + 1;
            } else {
                end = mid;
            }


        }
        return start; // as start = end
    }
}
