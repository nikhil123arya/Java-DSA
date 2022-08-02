package com.nikhil;

public class Main {

    public static void main(String[] args) {
        String a = "kunal";
        String b = "kunal";
        // ( == )comparator, it gives the answer true if both the reference variable are pointing to the same
        //object in the string pool
        System.out.println(a == b);

        a = "nikhil"; // String is not modified here, a new object is created and a is now pointing to nikhil
        // Strings cannot be modified for security purpose, they are final class
        System.out.println(a);

        // explicitly creating new objects out of string pool
        String name1 = new String("rahul");
        String name2 = new String("rahul");
        System.out.println(name1 == name2); // it will give false, both reference variable pointing to
        // two different object.
        System.out.println(name1.equals(name2)); // when we only want to check the values
    }
}
