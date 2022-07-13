package com.nikhil;
// https://leetcode.com/problems/search-in-rotated-sorted-array/
public class RBS {
    public static void main(String[] args) {
        //int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int[] arr = {2, 9,2,2,2};
        System.out.println(findPivotWithDuplicates(arr));
        int target = 1;
        System.out.println(search(arr, target));
    }
    static int search(int[] nums, int target) {
        //int pivot = findPivot(nums);
         int pivot = findPivotWithDuplicates(nums);

        // if you do not find the pivot, it means array is not rotated
        if (pivot == -1) {
            // just do normal binary search
            return binarySearch(nums, target, 0 , nums.length- 1);
        }
        // if pivot is found, you have found two ascending arrays
        // 3 cases
        if (nums[pivot] == target) {
            return pivot;
        }
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0,pivot-1);
        }
        return binarySearch(nums, target, pivot + 1, nums.length -  1);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

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
// this will not work in the case of duplicate values in array
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            }
            if (arr[mid] > arr[start]) {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
           // if element at mid, start, end are equal
            if (arr[mid] == arr[mid] && arr[mid] == arr[end]) {
                // skip the duplicate
                // NOTE:- if these elements at start and end were the pivots
                // check whether start is pivot
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // check whether end is pivot
                if (arr[end] < arr[end -1]) {
                    return end - 1;
                }
                end--;
            }
        }
        return -1;
    }
}
