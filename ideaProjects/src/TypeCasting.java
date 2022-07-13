import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        int num = input.nextInt();
//        System.out.println(num);

          //  type casting (narrowing)

//        int num = (int)(65.25f);
//        System.out.println(num);


//        int a  = 257;
//        byte b = (byte) a;      //257 % 256 = 1
//        System.out.println(b);

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = a * b / c;
//        System.out.println(d);
//
//        int number = 'A';
//        System.out.println(number);
//
//        System.out.println(3 * 23.4363f);

//        example to show type promotion in expressiom

        byte b = 45;
        char c = 'a';
        short s = 1024;
        int i = 5000;
        float f = 3.7544f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d * s);
        // float + int - double = double
        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
        System.out.println(result);

        //  example:

//          double d = 100.564;
//          long l = (long)d;
//          int i = (int)d;
//          System.out.println(d);
//          System.out.println(l);
//          System.out.println(i);


    }
}
