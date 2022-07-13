package com.nikhil;

import java.util.Scanner;

public class SearchInSTrings {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String name = in.nextLine();
//
//        char target = in.next().charAt(0);

        String name = "Nikhil";
        char target = 'k';
        System.out.println(search(name, target));
    }

    static boolean search(String str, char ch){
        // these are edge cases
        if (str.length() == 0){
            return false;
        }
        // run for loop
        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}

