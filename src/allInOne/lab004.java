package allInOne;

import java.util.Scanner;

public class lab004 {
    public static void main(String[] args) {
        // take a user input and print a table for that number.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int a = sc.nextInt();

        for (int i = 1; i < 11 ; i++) {
            int b = a * i;
            System.out.println(b);
        }

    }
}
