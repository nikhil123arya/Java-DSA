package com.nikhil;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 190, 322, 450};
        int target = 90;
        System.out.println(findTarget(arr, target));
    }
    static int findTarget(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            int nextStart = end + 1;
            // double the box value
            // end = previous end + size of box * 2
            end = end + (end - start + 1) * 2;
            start = nextStart;
        }
        return binarySearch(arr, target, start, end);
    }
    static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
            //find the middle element
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
