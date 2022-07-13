import java.util.Scanner;

public class Nestedswitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();

        String department = in.next();

        switch (empID) {
            case 1:
                System.out.println("Nikhil Arya");
                break;
            case 2:
                System.out.println("Kunal Kushwaha");
                break;
            case 3:
                System.out.println("employee number 3");
                switch (department) {
                    case "it" -> System.out.println("IT department");
                    case "management" -> System.out.println("Management department");
                    default -> System.out.println("no department entered");
                }
                break;
            default:
                System.out.println("enter correct employee id");
                break;
        }
    }
}
