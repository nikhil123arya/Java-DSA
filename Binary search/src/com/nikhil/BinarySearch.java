package com.nikhil;

public class BinarySearch {

    public static void main(String[] args) {
        // sorted array in ascending order
        int[] arr = {-12, -3, 0, 2, 5, 6, 8, 23, 30, 34, 39, 42, 50};
        int target = 29;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
    // return the index of searched item.
    // return -1 if it does not exist.
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            //find the middle element
            //int mid = (start + end) / 2;   might exceed the range of integer for large values
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            }
            else if (target > arr[mid]){
                start = mid + 1;
            }
            else {
                // answer found
                return mid;
            }
        }
        return -1;
    }
}
