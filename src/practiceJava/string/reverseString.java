package practiceJava.string;

public class reverseString {
    public static void main(String[] args) {
        String str = "Vaibhav";
        String str1 = "";
        char ch;

        System.out.print("Original String: ");
        System.out.println(str);

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            str1 = ch+str1;
        }

        System.out.println("Reversed String: " + str1);

        System.out.println("---------------------------------------------");

        StringBuilder abc = new StringBuilder("tab");
        System.out.println(abc.reverse());





    }
}



