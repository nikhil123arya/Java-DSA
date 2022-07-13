package com.nikhil;
// Factorial program in java.
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.print("please input a number to cal factorial: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int fact = 1;

        for (int i = 1; i <=n ; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
