import java.util.Scanner;

public class Fruit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String fruit = in.next();
//
//        switch (fruit) {
//            case "mango" -> System.out.println("king of fruits.");
//            case "apple" -> System.out.println("a sweet red fruit.");
//            case "orange" -> System.out.println("rich in vitamin c.");
//            case "banana" -> System.out.println("monkey loves banana.");
//            case "litchi" -> System.out.println("a small sweet fruit");
//            default -> System.out.println("please input valid fruit ");
//        }


        int day = in.nextInt();

//        switch (day){
//            case 1:
//                System.out.println("monday");
//                break;
//            case 2:
//                System.out.println("tuesday");
//                break;
//            case 3:
//                System.out.println("wednesday");
//                break;
//            case 4:
//                System.out.println("thursday");
//                break;
//            case 5:
//                System.out.println("friday");
//                break;
//            case 6:
//                System.out.println("saturday");
//                break;
//            case 7:
//                System.out.println("sunday");
//                break;
//            default:
//                System.out.println("please input a valid number");
//        }


        switch (day) {
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("thursday");
            case 5 -> System.out.println("friday");
            case 6 -> System.out.println("saturday");
            case 7 -> System.out.println("sunday");
            default -> System.out.println("please input a valid number");
        }


        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("weekday");
            case 6, 7 -> System.out.println("weekend");
            default -> System.out.println("please input a valid number");
        }

    }
}
