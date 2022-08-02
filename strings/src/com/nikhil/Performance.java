package com.nikhil;

public class Performance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            series = series + ch;
        }
        System.out.println(series);
        // this operation is having O(n²) complexity N(N+1) / 2
        // because every time you add to a String, a new String is created.
        // Strings can not be modified
    }
}
