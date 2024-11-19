package typeCasting;

public class DataTypeConversion {
    public static void main(String[] args) {

        // String to Numeric Type Conversion
        //Using Integer.parseInt and Double.parseDouble.

        String strInt = "123";
        String strDouble = "456.78";

        int intVal = Integer.parseInt(strInt);
        double doubleVal = Double.parseDouble(strDouble);

        System.out.println("Integer value: " + intVal);
        System.out.println("Double value: " + doubleVal);

    }

}
