package com.nikhil;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = new int[]{18, 124, 9, 1746, 98, 1};
        int ans = findNumbers(nums);
        System.out.println(ans);
        System.out.println(digits(-243434));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for(int num: nums){
            if (even(num)){
                count ++;
            }
        }
        return count;
    }
 // function to check whether a number contains even digits or not
    static boolean even(int num) {
        int numberofdigits = digits(num);
        return numberofdigits % 2 == 0;
    }

 // count no of digits in a numbers.
    static int digits(int num) {
        if(num < 0){
            num = num * -1;
        }
        if(num == 0){
            return 1;
        }

        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

}
