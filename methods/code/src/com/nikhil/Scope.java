package com.nikhil;

public class Scope {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        String name = "Nikhil";

        {
            //int name = "Kunal" // cannot be re initialised inside
            name = "bob marley"; // declared outside can be used/updated inside
            System.out.println(name);
              a = 100; // reassign the original ref variable to some other value
            System.out.println(a);

            int c = 99;

        }
        int c = 400;
        //System.out.println(c); // if initialised inside.cannot be used outside the block
        System.out.println(a);
        System.out.println(name);
        System.out.println(c);
    }
}
