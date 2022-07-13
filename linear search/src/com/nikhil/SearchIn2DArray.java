package com.nikhil;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 24, 56, 54,},
                {57, 45, 76, 34, 56, 76,},
                {43, 58, 67, 23, 65},
                {15, 17, 86, 44}
        };
        int target = 67;
        int[] ans = search(arr, target);// Format of the return value {row, col}
        System.out.println(Arrays.toString(ans));
        System.out.println(maxValue(arr));
        System.out.println(Integer.MIN_VALUE); // minimum value that a integer can hold.
    }
    // function to find the index of 2D array element.
     static int[] search(int[][] arr, int target){
         for (int row = 0; row < arr.length; row++) {
             for (int col = 0; col < arr[row].length; col++) {
                 if (arr[row][col] == target){
                     return new int[]{row, col};
                 }
             }
         }

         return new int[]{-1, -1};
     }


     // function to find the maximum value in 2D array.
     static int maxValue(int[][] arr){
        int max = Integer.MIN_VALUE;
         for (int row = 0; row < arr.length; row++) {
             for (int col = 0; col < arr[row].length; col++) {
                 if (arr[row][col] > max){
                     max = arr[row][col];
                 }
             }
         }
         return max;
     }


}
