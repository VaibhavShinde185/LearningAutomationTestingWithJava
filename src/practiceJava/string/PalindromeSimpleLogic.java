package practiceJava.string;

public class PalindromeSimpleLogic {
    public static void main(String[] args) {

        String s1 = "Was it a car or a cat I saw";
        String s2 = "";
        char ch;

        String sanitized = s1.replaceAll("\\s", "").toLowerCase();

        System.out.print("Original String: " + sanitized);
        System.out.print("\n");

        for (int i = 0; i < sanitized.length(); i++) {
            ch = sanitized.charAt(i);
            s2 = ch + s2;
        }

        System.out.print("Reversed String: " + s2);
        System.out.print("\n");

        if(sanitized == s2){
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }
    }
}
