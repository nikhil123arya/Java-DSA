package com.nikhil;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Syntax:
        ArrayList<Integer> list = new ArrayList<>(10);
        // add() func to add elements in the ArrayList.
        //it can add any number of elements, irrespective of initial size specified
        list.add(32);
        list.add(42);
        list.add(54);
        list.add(45);
        list.add(67);
        list.add(34);
        list.add(42);
        list.add(59);
        list.add(45);
//        list.add(63);
//        list.add(14);
//        list.add(42);
//        list.add(31);
//        list.add(55);
//        list.add(23);
//        list.add(44);

//     //   System.out.println(list.contains(43));
//        System.out.println(list);
//        list.set(0, 99);
//        list.remove(2);
//
//        System.out.println(list);
        list.remove(5);

     //   input
        for (int i = 0; i < 10 ; i++) {
            list.add(in.nextInt());
        }

     //  output
         for (int i = 0; i < 10 ; i++) {
             System.out.println(list.get(i));
        }

        
        
    }
}
