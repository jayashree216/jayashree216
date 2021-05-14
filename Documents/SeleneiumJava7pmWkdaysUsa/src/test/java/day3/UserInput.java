package day3;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int  num1= sc.nextInt();
        System.out.println("Enter 2nd number");
        int num2= sc.nextInt();
        add(num1,num2);
    }

    public static void  add(int x,int y){
        int sum= x+y;
        System.out.println("Addition of two number is"+sum);

    }
}
