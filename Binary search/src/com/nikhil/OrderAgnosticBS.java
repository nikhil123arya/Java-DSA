package com.nikhil;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        //int[] arr = {-12, -3, 0, 2, 5, 6, 8, 23, 33, 34, 39, 42, 50};
        int[] arr = {99, 75, 62, 55, 40, 33, 16, 8, 6, 3, 1};
        int target = 33;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }
    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find whether the array is sorted in ascending and descending order
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            //find the middle element
            int mid = start + (end - start) / 2;

            if (arr[mid] == target){
                return mid;
            }
            // if ascending
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
