package com.nikhil;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

     static void cyclic(int[] arr) {
        int i = 0;
         while (i < arr.length) {
             int correct = arr[i] - 1;
             if (arr[i] != arr[correct]) {
                 swap(arr, i, correct);
             } else {
                 i++;
             }
         }
     }
     static void insertion(int[] arr) {
         for (int i = 0; i < arr.length -1; i++) {
             for (int j = i + 1; j > 0; j--) {
                 if (arr[j] < arr[j-1]) {
                     swap(arr, j, j-1);
                 } else {
                     break;
                 }
             }
         }
     }


     static void selection(int[] arr) {
         for (int i = 0; i < arr.length; i++) {
             // find the max index in the array
             int last = arr.length - i -1;
             int maxIndex = getMaxIndex(arr, 0, last);
             swap(arr, maxIndex, last);
         }
     }
     static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
     }

     public static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end ; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }

        return max;
    }

    static void bubble(int[] arr) {
        // run the steps n-1 times
         for (int i = 0; i < arr.length; i++) {
             // for each step max element will come over the last respective index
             for (int j = 1; j < arr.length -i; j++) {
                 // swap if the item is less than the previous one
                 if (arr[j] < arr[j-1]) {
                     int temp = arr[j];
                     arr[j] = arr[j-1];
                     arr[j-1] = temp;
                 }
             }
         }
     }
}
