import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class practice_Lab2 {
        public static void main(String[] args) {

        String str1 = "Vaibhav";
        String str2 = "";
        char ch;

            System.out.println("Original String: " + str1);

            for (int i = 0; i < str1.length(); i++) {
                ch = str1.charAt(i);
                str2 = ch+str2;
            }
            System.out.println("Reversed String: "+ str2);
            System.out.println("-------------------------------------------");

            System.out.print("\n");

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String original = sc.nextLine();

            String sanitized = original.replaceAll("\\s+","").toLowerCase();
            System.out.println("Sanitized string: "+sanitized);

            String reversed = "";
            for (int i = sanitized.length() - 1; i >= 0 ; i--) {
                reversed += sanitized.charAt(i);
            }
            if(sanitized.equals(reversed)){
                System.out.println("\""+ original + "\" it is a palindrome");
            } else {
                System.out.println("\""+ original + "\" it is not a palindrome");
            }
        }
    }

