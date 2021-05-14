package day3;

import java.util.Scanner;

public class ExampleSwitchCase {
    public static void main(String[] args) {
        //new is object of scanner class
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string");
        String  name = sc.nextLine();
        System.out.println("student name is" +name);

        System.out.println("enter day");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("mon");
                break;
            case 2:
                System.out.println("tue");
                break;
            case 3:
                System.out.println("wed");
                break;
            case 4:
                System.out.println("thu");
                break;
            case 5:
                System.out.println("fri");
                break;
            case 6:
                System.out.println("sat");
                break;
            case 7:
                System.out.println("sun");
                break;
            default:
                System.out.println("Enter correct day");
        }

    }
}
