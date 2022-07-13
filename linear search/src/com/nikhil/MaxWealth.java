package com.nikhil;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr = {
                {2, 4, 6},
                {6, 3, 2},
                {4, 3, 1}
        };
        int ans = maximumWealth(arr);
        System.out.println(ans);
    }

    static int maximumWealth(int[][] accounts) {
        // customer - row
        // bankacc - col
        int maxvalue = Integer.MIN_VALUE;
        for (int customer = 0; customer < accounts.length ; customer++) {
            int rowsum = 0;
            for (int bankacc = 0; bankacc < accounts[customer].length; bankacc++) {
                rowsum = rowsum + accounts[customer][bankacc];
            }
            if(rowsum > maxvalue){
                maxvalue = rowsum;
            }
        }
        return maxvalue;
    }
}
