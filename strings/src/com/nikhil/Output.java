package com.nikhil;

import java.util.Arrays;

public class Output {
    public static void main(String[] args) {
        Integer num = new Integer(56); // wrapper class here converting primitive integer to integer object
        System.out.println(num.toString());

        System.out.println(56);
        System.out.println("kunal");
        System.out.println(Arrays.toString(new int[]{2, 3, 4, 5, 6}));

        float a = 453.12345f;
        // formatted string is printed using printf method without breaking into next line
        System.out.printf("Formatted number is %.2f", a); // Format specifier , pretty printing in java
    }
}
