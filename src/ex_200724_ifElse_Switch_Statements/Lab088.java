package ex_200724_ifElse_Switch_Statements;

import java.util.Scanner;

// Take a user input as char and Tell the user if it is a vowel

public class Lab088 {
    public static void main(String[] args) {
//       Scanner sc = new Scanner (System.in);
//        System.out.println("Enter a character:");
//        char user_input = sc.next().charAt(0);

//        switch (user_input) {
//            case 'a':
//                System.out.println("Vowel");
//                break;
//            case 'e':
//                System.out.println("Vowel");
//                break;
//            case 'i':
//                System.out.println("Vowel");
//                break;
//            case 'o':
//                System.out.println("Vowel");
//                break;
//            case 'u':
//                System.out.println("Vowel");
//                break;
//            default:
//                System.out.println("Consonent");
//                break;
//        }

    //    ----------------------------------
//        switch (user_input){
//            case 'a','e','i','o','u':
//                System.out.println("vowel");
//                break;
//            default:
//                System.out.println("consonant");
//        }

    //    -----------------------------------

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character:");
        var user_input = sc.next();


        if (user_input.length() == 1){
            char ch = user_input.charAt(0);

            if (ch =='a' || ch =='e' || ch =='i' || ch =='o'|| ch =='u' ||
                    ch =='A' || ch =='E' || ch =='I' || ch =='O' || ch == 'U');
            System.out.println(user_input +" is a vowel");
        } else {
            System.out.println(user_input + " is a consonant.");
        }
    }


}

