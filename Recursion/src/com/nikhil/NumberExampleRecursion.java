package com.nikhil;

public class NumberExampleRecursion {
    public static void main(String[] args) {
        // Function to print first five numbers 1 2 3 4 5
        print(1);
    }

    static void print(int n) {
        // Base condition: condition where the recursion will stop making new calls.
        if (n == 5) {
            System.out.println(5);
            return;
        }
        System.out.println(n);
        // Recursive Call
        // if you are calling a function again and again, you can treat it as a separate call in the stack

        // this is called tail recursion
        // this is the last function call
        print(n + 1); // generalised form
    }
}
