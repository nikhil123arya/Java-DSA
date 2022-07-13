package com.nikhil;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
       int[] arr = {2, 7, 11, 15};
       int target = 9;
       int ans = twosum(arr, target);
        System.out.println(ans);
    }
    static int twosum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] + arr[i+1] == target) {
                System.out.println(i);
                System.out.println(i+1);
            }
        }
        return 0;
    }
}
