package com.nikhil;

import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "kunal kushwaha";
        char target = 'a';
        System.out.println(search2(name, target));
        // to print string to character array
        System.out.println(Arrays.toString(name.toCharArray()));
    }
    static boolean search2(String name, char target) {
        if (name.length() == 0) {
            return false;
        }
        // for each loop
        for(char ch: name.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }


    static int search(String name, char target) {
        if(name.length() == 0) {
            return -1;
        }
        for (int i = 0; i < name.length(); i++) {
            if (target == name.charAt(i)) {
                return i;
            }
        }
        return -1;
    }
}
