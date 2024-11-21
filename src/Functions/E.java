package Functions;

import java.util.Scanner;

public class E {
    // No Parameters, with Return Type
    // Create a function that returns your favorite programming language as a string.

    public static void main(String[] args) {
        System.out.println("Your favourite programming language is " + lang());
    }

    static String lang(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your favourite programming language ");
        String name = sc.next();

        return name;
    }
}
