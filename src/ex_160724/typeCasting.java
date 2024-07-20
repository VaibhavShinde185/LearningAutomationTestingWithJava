package ex_160724;

public class typeCasting {
    public static void main(String[] args) {
        // Type Casting - Source and Destination conversion
        // Widening - Implicit, Explicit - data lossless
        // Narrowing - Implicit, Explicit(with data type), data loss

        // Widening
        byte b=10;
        int a=b; // VALID – Implicit Casting - JVM
        int a1= (int)b; // VALID – Explicit Casting
        System.out.println(a1);

        // Narrowing
        int val = 300;
        //byte b1 = val; // Invalid - Implicit Casting - JVM
        byte b1 = (byte)val; // InVALID – Explicit Casting - // Loss of data
        System.out.println(b1);

        int course = 100;
        float GST = 18.45F;
       // int total_price = course+GST; // Implicit Narrowing - JVM
        int total_price = course+(int)GST; // Explicit narrowing - REAL time - money loss
        System.out.println(total_price);

    }
}
