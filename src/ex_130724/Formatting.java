package ex_130724;

public class Formatting {
    public static void main(String[] args) {
        // Formatting
        int age = 98;
        System.out.println("You age is -> " + age);
        // %d ->  any integer - byte, short, int or long
        // %s -> String
        // %c -> char
        // %f -> float
        System.out.printf("You age is -> %d",age);

        int n = 9;
        System.out.printf("%d",n);
    }
}