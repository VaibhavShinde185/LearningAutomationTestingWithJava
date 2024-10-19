package ex_130724;

public class Formatting {
    public static void main(String[] args) {
        // Formatting
        int age = 98;
        System.out.println("Your age is -> " + age);
        // %d ->  any integer - byte, short, int and long
        // %s -> String
        // %c -> char 
        // %f -> float and double
        System.out.printf("Your age is -> %d",age);

        int n = 9;
        System.out.println();
        System.out.printf("%d",n);

    }
}