import java.sql.SQLOutput;
import java.util.Scanner;

public class practice_Lab {
    public static void main(String[] args) {
    /* Factorial Number
    fact(5) = 5*4*3*2*1 = 120
     */
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number, i will tell you factorial");
        int n = sc.nextInt();

        int fact = 1;
        for ( int i = 1; i <= n; i++ ){
            fact = fact * i;
        }
        System.out.println("Factorial of entered number is " + fact);
    }
}

