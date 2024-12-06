import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
public class practice_Lab {
    public static void main(String[] args) {

        String str1 = "Vaibhav";
        String str2 = "";
        char ch;

        System.out.println("Original String: " + str1);

        for (int i = 0; i < str1.length(); i++) {
            ch = str1.charAt(i);
            str2 = ch+str2;
        }
        System.out.print("Reversed String: " + str2);
        }
    }


