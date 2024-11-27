package practiceJava.typeCasting;

public class CastingBetweenPrimitiveTypes {
    public static void main(String[] args) {

        // Casting between different primitive types.

        char charVal = 'A';
        int intVal = charVal;  // Widening (char to int)
        char anotherCharVal = (char) (intVal + 1);  // Narrowing (int to char)

        System.out.println("Character: " + charVal);
        System.out.println("Integer value: " + intVal);
        System.out.println("Next Character: " + anotherCharVal);

    }
}
