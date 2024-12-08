import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
public class practice_Lab {
    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "";
        char ch;

        for (int i = 0; i < str1.length(); i++) {
            ch = str1.charAt(i);
            str2 = ch+str2;
            }
        System.out.println("Reversed String: "+ str2);
        System.out.println("---------------------------------------------------------------");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String original = sc.nextLine();

        String sanitized = original.replaceAll("\\s+","").toLowerCase();

        String reversed = "";
        for (int i = sanitized.length() - 1; i >= 0 ; i--) {
            reversed += sanitized.charAt(i);
        }
        if (sanitized.equals(reversed)){
            System.out.println("\""+original+"\" it is pallindrome");
        } else {
            System.out.println("\""+original+"\" it is not pallindrome");

        }

        }
    }


