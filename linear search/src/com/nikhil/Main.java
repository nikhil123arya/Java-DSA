package com.nikhil;
// Linear Search in an array
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = {23, 34, 15, 46, 37, 88, 75};
        int target = in.nextInt();
        int ans = linearSearch(arr, target);

        if (ans != -1){
            System.out.print("item found at index: " + ans);
        }
        else {
            System.out.print("item not found: ");
        }
    }

    // search in the array and return the index if the item is found.
    // otherwise, return -1
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        // run for loop
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target){
                return index;
            }
        }
        // this return statement will execute if none of the above return statement is executed
        // hence the target not found
        return -1;
    }
}
