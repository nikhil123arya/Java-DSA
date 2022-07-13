package com.nikhil;
/*
Given an integer number n, return the difference between the product of its digits and the sum of its digits.


Example 1:

Input: n = 234
Output: 15
Explanation:
Product of digits = 2 * 3 * 4 = 24
Sum of digits = 2 + 3 + 4 = 9
Result = 24 - 9 = 15

 */

import java.util.Scanner;

public class SubtractProductandSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int pro = 1;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            pro = pro * rem;
            sum = sum + rem;
            n = n / 10;
        }
        int diff = pro - sum;
        System.out.println(pro);
        System.out.println(sum);
        System.out.println("difference =" + diff);
    }
}
