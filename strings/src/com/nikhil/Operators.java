package com.nikhil;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println('a' + 3);
        /* this is known as "OPERATOR OVERLOADING"
        * here (+) operator is giving us more functionality
        * on String objects the + object is overloaded, it concatenates more than one strings
        * here in java operator overloading is not supported, because it results in poor code
        * there is only one exception in case of Strings i.e + to support String concatenation
        * */

        System.out.println((char)('a' + 3));
        System.out.println("a" + 2);
        System.out.println("kunal" + new ArrayList<>()); // if there is an object here it will call tostring() to gets
        // its String value and addd it to the string.
        System.out.println("nikhil" + new Integer(76));
        //System.out.println(new Integer() + new ArrayList<>()); // Error
        // you can use this with every complex object but the only condition is that
        //at least one of these object is of type string.

        String expression = new Integer(56) + "" + new ArrayList<>();
        System.out.println(expression);
    }
}
