package ex_170824.wrapperClass;

public class lab198 {
    public static void main(String[] args) {
            Double d = 3.14;                    // stored in a HEAP memory. It is a wrapper class.
            double val = d.doubleValue();       // stored in a continuous memory. It is a primitive class.
            System.out.println(d);
            System.out.println(val);

            String s1 = "pramod"; // SCP
            String s2 = new String("pramod"); // HEAP

        }
}
