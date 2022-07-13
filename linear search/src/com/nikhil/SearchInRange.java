package com.nikhil;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = new int[] {
                13,
                34,
                56,
                75,
                43,
                98
        };
         int target = 7;
         int start = 2;
         int end = 5;
         int ans = search(arr, target, start, end);
        System.out.print("item found at index: " + ans);
    }

    static int search(int[] arr, int target, int start, int end) {
        for (int index = start; index < end ; index++) {
            if (target == arr[index]){
                return index;
            }
        }
        return -1;
    }
}
