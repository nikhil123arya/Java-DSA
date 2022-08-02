package com.nikhil;

import java.util.Arrays;
import java.util.Locale;

public class Methods {
    public static void main(String[] args) {
     String name = "kunal Kushwaha";
     String add = "rishi vihar dehradun India";
     System.out.println(Arrays.toString(name.toCharArray()));
     //method performed on Strings
        System.out.println(name.indexOf('s'));
        System.out.println(name.toUpperCase());
        System.out.println("       kunal   ".strip());

        System.out.println(Arrays.toString(add.split(" ")));
    }
}
