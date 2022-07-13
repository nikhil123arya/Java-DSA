package com.nikhil;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

     // array of primitives
        int[] arr = new int[5];

     // input using for loop
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

//     // enhanced for loop
//        for (int j : arr) {
//            System.out.print(j + " ");
//        }

     // best way to print array elements
        System.out.println(Arrays.toString(arr));

        // array of objects
        String[] ar = new String[4];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = in.next();
        }

        System.out.println(Arrays.toString(ar));





    }
}
