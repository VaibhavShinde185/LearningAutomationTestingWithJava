package practiceJava.typeCasting;

public class TypeCastingwithDivision {
    public static void main(String[] args) {

        // Demonstrates the effect of casting in arithmetic operations.

        int num1 = 5;
        int num2 = 2;

        double resultWithoutCasting = num1 / num2;  // Integer division
        double resultWithCasting = (double) num1 / num2;  // Type cast to double

        System.out.println("Result without casting: " + resultWithoutCasting);
        System.out.println("Result with casting: " + resultWithCasting);

    }

}
