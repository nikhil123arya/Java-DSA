import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      // take input from user till user does not press X or x

        while (true){
            // take operator as input
            System.out.print("please input operator: ");
            char op = in.next().trim().charAt(0);
            int ans = 0;

            if ( op == '+' || op == '-'|| op == '*' || op == '/' || op == '%' ){
                // input two numbers
                System.out.print("Input two numbers: ");
                int a = in.nextInt();
                int b = in.nextInt();
                System.out.println();

                if (op == '+'){
                    ans = a + b;
                }
                else if (op == '-'){
                    ans = a - b;
                }
                else if (op == '*'){
                    ans = a * b;
                }
                else if (op == '/'){
                    if (b != 0){
                        ans = a / b;
                    }
                }
                 if (op == '%'){
                    ans = a % b;
                }

            } else if(op == 'X' || op == 'x'){
                break;
            }
            else{
                System.out.println("Invalid operator...!!");
            }
            System.out.println(ans);
        }
    }
}
