package com.nikhil;

public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 4, 3, 2};
        System.out.println(PeakIndexInMountainArray(arr));
    }

    static int PeakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            // there will be two possibility i.e either mid will be in ascending part of array or it will be in descending
            // part of array
            // case 1: ascending part
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }
            // case 2: descending part of array
            else if(arr[mid] > arr[mid + 1]) {
                end = mid;
            }
        }
        return start; // or end as both are same.
    }
}
