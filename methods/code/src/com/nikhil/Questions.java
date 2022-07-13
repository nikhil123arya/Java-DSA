package com.nikhil;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);
    }
//
//    static boolean isArmstrong(int n)
    
    
    
    
    
    
    
    
    static boolean isPrime(int num) {
        if(num <= 1){
            return false;
        }
        int c = 2;
        while(c*c <= num){
            if (num % c == 0) {
                return false;
            }
            c++;
        }
        if(c*c > num){
            return true;
        }
        return false;
    }
}
