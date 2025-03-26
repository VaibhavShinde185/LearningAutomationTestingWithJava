import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class practice_Lab2 {
        public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
            System.out.println("Enter a character system will tell weather it is Vowel or Consonant");
            var userInput = sc.next();

            userInput = userInput.toLowerCase();

            if(userInput.length() == 1){
                char ch = userInput.charAt(0);
                if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ){
                    System.out.println(userInput + " it is a vowel");
                } else {
                    System.out.println(userInput + " it is a consonant");
                }

            } else {
                System.out.println("You entered a String!");
            }

        }
    }

