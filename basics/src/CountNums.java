import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        int n = 455155;

        int count = 0;
        while (n > 0){
            int temp = n % 10;
            if ( temp == 5){
                count += 1;
            }
            n = n / 10;
        }
        System.out.println(count);
    }
}
