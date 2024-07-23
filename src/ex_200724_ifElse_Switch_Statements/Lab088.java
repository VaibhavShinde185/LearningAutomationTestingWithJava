package ex_200724_ifElse_Switch_Statements;

import java.util.Scanner;

// Take a user input as char and Tell the user if it is a vowel

public class Lab088 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character, I will tell you, it is a vowel or consonent");
        String userInput = sc.next();
        System.out.println(userInput);

        switch (userInput){
            case 'a','e','i','o','u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonent");
                break;

        }
    }
}

// unable to execute. Got some error fix it before proceed  Lab094 Pramod VCS
