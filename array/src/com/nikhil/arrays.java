package com.nikhil;

public class arrays {
    public static void main(String[] args) {

        // Q: store a roll number
        int a = 19;

        // Q: store a person's name
        String name = " Nikhil Arya";

        // Q: store 5 roll numbers
        int rno1 = 23;
        int rno2 = 12;
        int rno3 = 29;
        int rno4 = 20;
        int rno5 = 16;

        /*
            Syntax:-
            datatype[] variable_name = new datatype[size];
        */
         // store 5 roll numbers
         int[] rnos = new int[5];
         // or directly
        int[] rnos2 = {23, 12, 45, 32, 15};


        int[] ros; // declaration of array. ros is getting defined in the stack
        ros = new int[5]; // initialisation: actually here object is being created in the memory(hsout

        System.out.println(ros[1]); // By default everything in it is zero in integer array.

        String[] arr = new String[5];
        System.out.println(arr[0]);




    }
}
