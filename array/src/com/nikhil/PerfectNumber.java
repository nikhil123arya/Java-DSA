package com.nikhil;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int sum = 0;
        System.out.print("Please input a number to find whether it is perfect or not: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i < n; i++) {
            if (n % i == 0){
                sum = sum + i;
            }
        }
        if (sum == n){
            System.out.println("Prefect number");
        }
        else {
            System.out.println("Not Perfect");
        }
    }

}
