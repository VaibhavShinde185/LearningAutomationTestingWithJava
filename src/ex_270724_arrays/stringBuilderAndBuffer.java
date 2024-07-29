package ex_270724_arrays;

public class stringBuilderAndBuffer {
    public static void main(String[] args) {

//        String s1 = new String("Vaibhav");      //Heap Area
//        String s2 = "Vaibhav";                 // SCP -> String constant pool
//
//        // String immutable in nature
//        System.out.println(s1.length());
//        System.out.println(s1.charAt(3));
//        System.out.println(s2.toUpperCase());
//        System.out.println(s1.toLowerCase());
//        System.out.println("-------------------------------");
//
//        System.out.println(s1);
//        System.out.println(s2);


        String s1 = "Vaibhav";
        s1 = "Shinde";
        System.out.println(s1);
        System.out.println("-----------------------------------");

        StringBuffer sbf = new StringBuffer("Vaibhav"); // thread safe
        sbf.append(" Shinde");
        sbf.append(" JI");
        System.out.println(sbf);

        System.out.println("-----------------------------------");

        StringBuilder sbd = new StringBuilder("Radha"); //not thread safe
        sbd.append("-Krishna");
        sbd.append(" Gopika");
        System.out.println(sbd);
        System.out.println(sbd.reverse().toString());

    }
}
