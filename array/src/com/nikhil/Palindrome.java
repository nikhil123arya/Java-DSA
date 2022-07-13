package com.nikhil;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.print("Please input a number to check if it is palindrome or not: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        boolean result = isPalindrome(n);
        System.out.println(result);
    }

    static boolean isPalindrome(int n) {
          int num = 0;
          int original = n;
          while (n > 0){
              int rem = n % 10;
              num = num * 10 + rem;
              n = n / 10;
          }
        return num == original;
    }
}
