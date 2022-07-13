import java.util.Scanner;

public class Conditional{
    public static void main(String[] args) {
        /*
           if statement syntax:
          if ( boolean expression T or F){
               //body
           } else {
               // do this
             }


         */


        Scanner in = new Scanner(System.in);
        System.out.println("please input salary");
        int salary = in.nextInt();
//
//        if (salary > 10000){
//            salary = salary + 2000;
//        }
//        else {
//            salary = salary + 1000;
//        }
//        System.out.println("final salary after adding bonus\t" + salary);


            //Multiple if else condition
        if (salary > 10000){
            salary += 2000;
        } else if (salary > 30000){
            salary += 3000;
        } else {
            salary +=1000;
        }
        System.out.println(salary);

    }
}







