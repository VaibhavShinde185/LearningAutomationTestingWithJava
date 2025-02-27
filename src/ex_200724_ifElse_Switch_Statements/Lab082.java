package ex_200724_ifElse_Switch_Statements;
/*
Take input from user and check that whether they are eligible to vote or not.
Ans. The code is written in 2 methods.
        A. If else statement
        B. Ternary operator
*/
import java.util.Scanner;

public class Lab082 {
    public static void main(String[] args) {

        // A. If else statement
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name:");
        String name = scanner.nextLine();

        System.out.println("Enter your age:");
        int age = scanner.nextInt();

        if (age >= 18){
           System.out.println("Hello " + name + " you are allowed to vote.");
       } else {
           System.out.print(name + " Go home and understand the system");
       }
        scanner.close();

        // B. Ternary operator
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter your name:");
//        String name = scanner.nextLine();
//
//        System.out.print("Enter your age:");
//        int age = scanner.nextInt();
//
//        var Elligibilty = (age >= 18) ? (name + " you are allowed to vote") : (name + " Go home");
//        System.out.println(Elligibilty);


    }
}