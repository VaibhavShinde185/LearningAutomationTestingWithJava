package ex_200724_ifElse_Switch_Statements;

/*
Take input from user and find the maximum number from given input.
*/

import java.util.Scanner;

public class Lab084 {
    public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

        System.out.println("Enter a 1st number:");
        int number1 = sc.nextInt();

        System.out.println("Enter a 2nd number:");
        int number2 = sc.nextInt();

        System.out.println("Maximum number is " + Math.max(number1, number2));

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter a number1");
//        int number1 = sc.nextInt();
//
//        System.out.println("Enter a number2");
//        int number2 = sc.nextInt();
//
//        if (number1 > number2) {
//            System.out.println("Maximum number is " + number1);
//        } else {
//            System.out.println("Maximum number is " + number2);
//        }
    }
}
