package ex_200724_ifElse_Switch_Statements;

/*
Take input from user and check entered number is even or odd.
*/

import java.util.Scanner;

public class Lab083 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number:");
        int number = scanner.nextInt();

        if (number % 2 == 0){
            System.out.println(number + " is a even number");
        }else{
            System.out.println(number + " is a odd number");
        }
    }
}
