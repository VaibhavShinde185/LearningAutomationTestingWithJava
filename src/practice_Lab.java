import java.sql.SQLOutput;
import java.util.Scanner;

public class practice_Lab {
    public static void main(String[] args) {

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


// Lab095 need to check in recording, 96,

// Lab100, 102,

