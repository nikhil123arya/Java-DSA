package com.nikhil;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        // Create an array
        int[] arr = {3,5,6,4,7,8};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void change(int[] arr) {
        arr[0] = 99;
    }
}
