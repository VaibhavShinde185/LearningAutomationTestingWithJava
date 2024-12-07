import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
public class practice_Lab {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String original = sc.nextLine();

        String sanitized = original.replaceAll("\\s+","").toLowerCase();

        String reversed = "";
        for (int i = sanitized.length()-1; i >= 0 ; i--) {
            reversed += sanitized.charAt(i);
        }
        if (sanitized.equals(reversed)){
            System.out.println("\" " + original + "\" is a palindrome. ");
        } else {
            System.out.println("\" " + original + "\" is not a palindrome. ");
        }
        }
    }


