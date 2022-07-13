package com.nikhil;

public class Shadowing{
    static int x = 90; // this will be shadowed
    public static void main(String[] args) {
        System.out.println(x); // 90
        int x = 40;// the class variable at line 2 is shadowed by this
        System.out.println(x); // 40
        fun();
/*
     -> the variable with the  higher level of scope is hidden.( bc the lower level is overriding the upper level)
 */
        int b;
       // System.out.println(b); // scope will begin when the value is initialised.
        b = 99;
    }

    private static void fun() {
        System.out.println(x);
    }

}