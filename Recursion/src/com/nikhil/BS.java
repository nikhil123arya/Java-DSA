package com.nikhil;

public class BS {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 34, 45};
        int target = 56;
        int index= search(arr, target,0,arr.length-1);
        System.out.println(index);
    }
    static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
         int m = s + (e - s) / 2;

        if (arr[m] == target) {
            return m;
        }

        if (target < arr[m]) {
            return search(arr, target, s, m-1);
        }
        return search(arr, target, m+1 , e);
    }
}
