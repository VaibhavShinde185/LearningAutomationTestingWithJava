package Functions;

import java.util.Scanner;

import static Functions.D.printSquare;

public class D {
    // No Parameters, with Return Type
    // Write a function that returns the square of a fixed number (e.g., 7).

    public static void main(String[] args) {
        int square = printSquare();
        System.out.println("The square of entered number is " + square);
    }

    static int printSquare(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number ");
        int a = sc.nextInt();

        int square = a * a;
        return square;

    }

}
