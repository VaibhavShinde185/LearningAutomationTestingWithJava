package allInOne;

import java.util.Scanner;

public class lab002 {
    public static void main(String[] args) {
        // take input from users using the Scanner class then perform arithmetic operations

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number ");
        int a = sc.nextInt();

        System.out.println("Enter a second number ");
        int b = sc.nextInt();

        int sum = a+b;
        int div = a/b;

        System.out.println("The addition of entered numbers is " + sum);
        System.out.println("Multiplication is = " + a*b);
        System.out.println("Subtraction is = " + (a-b));
        System.out.println("The division of entered numbers is " + div);



    }
}
