package com.nikhil;

public class Fibo {
    public static void main(String[] args) {
        // to find nth fibonacci number it will take much time to do it
//        int ans = fibo(4);
//        System.out.println(ans);

        for (int i = 0; i < 11; i++) {
            System.out.println(fiboNumber(i));
        }
    }
// using formula of Nth fibonacci number
    static int fiboNumber(int n) {
        // just for demo use long instead, ignore the
//        return (int)((Math.pow(((1 + Math.sqrt(5)) / 2), n) - Math.pow(((1 - Math.sqrt(5)) / 2), n)) / Math.sqrt(5));
        return (int)(Math.pow(((1 + Math.sqrt(5)) / 2), n) / Math.sqrt(5));
    }

    // using recursion
    static int fibo(int n) {
        // base condition
        if (n < 2) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
}
