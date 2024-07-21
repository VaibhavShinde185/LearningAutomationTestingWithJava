package ex_140724;

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

        /* Implicit casting is automatically done by the Java compiler. It happens when you are converting a
        smaller data type to a larger data type, also known as widening conversion. For example, converting
        an int to a long or a float to a double. This type of casting is safe and does not lead to data loss. */

        /* Explicit casting is done manually by the programmer. It happens when you are converting
        a larger data type to a smaller data type, also known as narrowing conversion. This type of casting
        can lead to data loss if the value of the larger data type is out of the range of the smaller data type.
         */

        /* In Java, you can also cast objects of different classes that are part of the same inheritance hierarchy. The casting can be:
        Upcasting: Casting a subclass object to a superclass type.
        Downcasting: Casting a superclass object to a subclass type. */
    }
}
