package ex_210724_loops;

import java.util.Scanner;

// Take a input from user & print a table of given input.
public class Lab106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        int b;

        for ( int i = 1; i <= 10; i++){
            b = a * i;
            {
                System.out.println(b);
            }
        }
    }
}
