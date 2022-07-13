package com.nikhil;

import java.util.Scanner;

public class SumOfAllnumbers {
    public static void main(String[] args) {
        System.out.println("please enter series of values 0 to exit");
        Scanner in = new Scanner(System.in);
        int avg = 0;
        int small = 0;
        int large = 0;
        int sum = 0;
        int input;
        int counter = 0;

        while((input = in.nextInt())!= 0) {
            small = Integer.min(small ,input);
            large = Integer.max(large, input);
            sum = sum + input;
            counter ++;
        }
        avg = sum / counter;
        System.out.println("the sum of all integers " + sum);
        System.out.println("the smallest integer is " + small);
        System.out.println("the largest integer is " + large);
        System.out.println("the average value is " + avg);
    }
}
