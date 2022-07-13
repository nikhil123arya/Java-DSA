package com.nikhil;

public class SearchInMountain {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 6, 4, 3, 2, 0};
        int target = 5;
        int ans = search(arr, target);
        System.out.println(ans);
    }
    public static int search(int[] arr, int target) {
        int peak = PeakIndexInMountainArray(arr);
        int ans = orderAgnosticBS(arr, target, 0, peak);
        if (ans != -1) {
            return ans;
        }
        return orderAgnosticBS(arr,target,peak,arr.length-1);
    }
    static int orderAgnosticBS(int[] arr, int target, int start, int end) {

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

    public static int PeakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int peak = 0;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < arr[mid + 1]) {
                start = peak = mid + 1;
            } else {
                end = mid;
            }
        }
        return peak;
    }
}
