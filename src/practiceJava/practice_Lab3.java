package practiceJava;

import java.util.Scanner;

public class practice_Lab3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character, system will tell is it a vowel or consonant or a string");
        var userInput = sc.next();
        userInput = userInput.toLowerCase();

        if (userInput.length() == 1){
            char ch = userInput.charAt(0);

            if ( ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                System.out.println("You have entered a vowel");
            } else {
                System.out.println("Consonant");
            }

        } else {
            System.out.println("You have entered a string.");
        }


    }
}
