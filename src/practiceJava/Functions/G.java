package practiceJava.Functions;

public class G {
    // With Parameters and With Return Type
    // Write a function that accepts two numbers and returns their greatest common divisor (GCD).

    public static void main(String[] args) {
        int num1 = 12, num2 = 18;
        System.out.println("The GCD of " + num1 + " and " + num2 + " is " + findGCD(num1, num2));
        System.out.println("The lcm of " + num1 + " and " + num2 + " is " + findLCM(num1, num2));

    }

    // Function that accepts two numbers and returns their GCD
    static int findGCD(int a, int b) {
        // Using the Euclidean Algorithm
        while (b != 0) {
            int temp = b;
            b = a % b;  // a % b is the remainder
            a = temp;   // Assign b to a
        }
        return a;  // When b becomes 0, a is the GCD
    }


    static int findLCM(int a, int b){
        int lcm = (a * b) / findGCD(a, b);
        return lcm;
    }

}
