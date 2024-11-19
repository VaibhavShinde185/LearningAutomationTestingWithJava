package typeCasting;

public class NarrowingExplicitCasting {
    public static void main(String[] args) {

        // Narrowing requires explicit casting when converting a larger type to a smaller type.

        double doubleVal = 99.99;
        int intVal = (int) doubleVal;  // Manual conversion

        System.out.println("Double value: " + doubleVal);
        System.out.println("Integer value: " + intVal);  // Fractional part lost

    }
}
