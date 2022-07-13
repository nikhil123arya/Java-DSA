package com.nikhil;
//https://leetcode.com/problems/search-insert-position/
public class Cealing {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        System.out.println(cealing(arr, 16));
    }
    static int cealing(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return arr[mid];
            }
            else if(target < arr[mid]) {
                end = mid -1;
            }
            else if (target > arr[mid]) {
                start = mid + 1;
            }
        }
        return arr[start];
    }
}
