package com.nikhil;
// Input a number and print all the factors of that number (use loops).
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("please input a number ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 1; i <= n ; i++) {
            if(n % i == 0){
                System.out.print( i + " ");
            }
        }
    }
}
