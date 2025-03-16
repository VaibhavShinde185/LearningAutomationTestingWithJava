package practiceJava.typeCasting;

public class CastingBetweenWrapperClassesandPrimitives {
    public static void main(String[] args) {

        // Demonstrates boxing and unboxing.

        Integer intObj = 50;  // Auto Boxing
        int intVal = intObj;  // Unboxing

        Double doubleObj = 25.67;  // Boxing
        double doubleVal = doubleObj;  // Unboxing

        System.out.println("Integer object: " + intObj);
        System.out.println("Unboxed integer: " + intVal);
        System.out.println("Double object: " + doubleObj);
        System.out.println("Unboxed double: " + doubleVal);


    }
}
