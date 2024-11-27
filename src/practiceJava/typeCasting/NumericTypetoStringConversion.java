package practiceJava.typeCasting;

public class NumericTypetoStringConversion {
    public static void main(String[] args) {

        // Using String.valueOf.

        int intVal = 789;
        double doubleVal = 123.45;

        String strInt = String.valueOf(intVal);
        String strDouble = String.valueOf(doubleVal);

        System.out.println("String from Integer: " + strInt);
        System.out.println("String from Double: " + strDouble);

    }
}
