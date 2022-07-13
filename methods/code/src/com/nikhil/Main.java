package com.nikhil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int result = sum2();//value
//        System.out.println(result);
//
//        String message = greet();
//        System.out.println(message);

//        int sum = sum3(100,500);
//        System.out.println(sum);

        String personalised = myGeet("Nikhil Arya");
        System.out.println(personalised);

    }

    // Parameter (String functions)
    static String myGeet(String name) {
        String message = "Hello " + name ;
        return message;
    }

    // pass the value as a parameter ( while calling in the main method)
    static int sum3(int x, int y){
        int z = x + y;
        return z;
    }






    // return the value
    static int sum2() {
        Scanner in = new Scanner(System.in);
        System.out.print("input 1st number: ");
        int a = in.nextInt();
        System.out.print("input 2nd number: ");
        int b = in.nextInt();
        int sum = a + b;
        return sum;
    }

    // returning a  String
    static String greet() {
       String greeting = "how are you";
       return greeting;
    }



 // its basically printing the sum.
    static void sum() {
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("sum of 10 and 20 is : " + sum);
    }

    /*
        return_type name() {
          //body
          return statement;
        }

     */
}
