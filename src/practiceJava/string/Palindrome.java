package practiceJava.string;

//Input : str = "abba"
//Output: Yes
//Input : str = "pramod"
//Output: No

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter a string: ");
        String original = scanner.nextLine();

        // Remove spaces and convert to lowercase (optional for case-insensitive comparison)
        String sanitized = original.replaceAll("\\s+", "").toLowerCase();

        // Reverse the string
        String reversed = "";
        for (int i = sanitized.length() - 1; i >= 0; i--) {
            reversed += sanitized.charAt(i);
        }

        // Check if the original and reversed strings are the same
        if (sanitized.equals(reversed)) {
            System.out.println("\"" + original + "\" is a palindrome.");
        } else {
            System.out.println("\"" + original + "\" is not a palindrome.");
        }

    }

}
