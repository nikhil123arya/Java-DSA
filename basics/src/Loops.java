import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /*
           syntax of for loop:
           for ( initialisation; condition; increment/decrement){
              //body
           }
         */

//        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
//        }

        //Q: Print number from 1 to n
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int num = 1; num <= n; num++){
            System.out.println(num);
        }


        /*
            //while loop Syntax:
            while (condition){
               //body
            }

         */

        int num = 1;
        while (num<=5){
            System.out.print(num + " ");
            num = num + 1;
        }


        /* do while loop: it will execute the body at least once. */
        /*

            do {
                //body
           } while (condition);

         */

//        int n = 1;
//        do {
//            System.out.println("hello world");
//        } while (n != 1);
//

    }
}
