package ex_130724;

public class escape_Char {
    public static void main(String[] args) {
        //Escape characters
        char c = '\n'; // New line / Next Line
        char c1 = '\t'; // Add Tab
        char c2 = '\b'; // Backlash, delete 1 char
        char c3 = '\r'; // Backlash, delete 1 word

        System.out.println("Vaibhav"+c+"Shinde");
        System.out.println("Vaibhav"+"\t"+"Shinde");
        System.out.println("Vaibhav"+"\b"+" Shinde");
        System.out.println("Vaibhav"+"\r"+" Shinde");

        String str = null;
        System.out.println(str);
    }
}
