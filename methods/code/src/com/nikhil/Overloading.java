package com.nikhil;

public class Overloading {
    public static void main(String[] args) {
//        fun(34);
//        fun("Nikhil");

       // int result = sum(4,6);
        int result = sum(4,6,3);
        System.out.println(result);

    }
    static int sum(int a, int b,int c){
        return a + b + c;
    }
    static int sum(int a, int b){
        return a + b;
    }

    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println(name);
    }
}
