import java.util.*;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a number to check it is prime or not");
        int num = sc.nextInt();
        int c=2;
        if (num<=1){
            System.out.println("neither prime nor composite");
        }

        while ((c*c)<=num){
            if(num%c==0){
                System.out.println("not prime");
                break;
            }
            c+=1;
        }
        System.out.println("prime ");
    }
}

