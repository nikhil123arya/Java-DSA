package com.nikhil;

public class Problem {
    public static void main(String[] args) {
        int[] nums = new int[] { 12, 345, -4345, 34, 0, 645, 65};
        System.out.println(findNumber(nums));
    }
    static int findNumber(int[] arr) {
        int count = 0;
        for(int num : arr) {
            if(even(num)) {
                count++;
            }
        }
        return count;
    }
    static boolean even (int num) {
        int Numberofdigits = digits2(num);
        if(Numberofdigits % 2 == 0){
            return true;
        }
        return false;
    }

    static int digits(int num) {
        int count = 0;
        while (num > 0) {
            count ++;
            num = num / 10;
        }
        return count;
    }

    static int digits2(int num) {
        if(num < 0) {
            num = num * -1;
        }
        return (int)(Math.log10(num)) + 1;
    }

}
