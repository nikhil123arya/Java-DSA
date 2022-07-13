package com.nikhil;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(4,4,5,6,3,235,46,567,887,45,45,34);
        multiple(45, 68, "kunal", "nikhil", "fjahskd");
    }

    static void multiple(int a, int b, String ...name){

    }

    static void fun(int ...var) {
        System.out.println(Arrays.toString(var));
    }
}