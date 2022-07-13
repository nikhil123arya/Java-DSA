import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("please enter some input");
//        int rollno = input.nextInt();
//        System.out.println("your roll number is "+ rollno);

        System.out.println("please input you name");
        String name = input.nextLine();
        System.out.println("your name is " + name);

        float marks = input.nextFloat();
        System.out.println("your marks =" + marks);
    }
}
