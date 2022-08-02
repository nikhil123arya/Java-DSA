package com.nikhil;

public class SB {
    public static void main(String[] args) {
        // String Builder data type
        StringBuilder build = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            build.append(ch); // the same original object is being modified here by appending into it,
            //(for modifying String we have StringBuilder class in java)
            // no new String object is created as in the performance.java example
            // here complexity
        }
        System.out.println(build);
    }
}
