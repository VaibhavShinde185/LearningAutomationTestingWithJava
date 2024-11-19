package typeCasting;

public class WideningImplicitCasting {
    public static void main(String[] args) {

        // Widening casting is done automatically when converting a smaller type to a larger type.

        int intVal = 100;
        double doubleVal = intVal;  // Automatic conversion

        System.out.println("Integer value: " + intVal);
        System.out.println("Double value: " + doubleVal);

    }
}
