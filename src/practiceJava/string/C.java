package practiceJava.string;

public class C {
    public static void main(String[] args) {

        /** String Builder and String Buffer
            - Strings - immutable in nature
            - StringBuilder and StringBuffer will solve memory wastage problems and creates a mutable strings.
            - StringBuilder: - Not Synchronized and not thread safe also it is faster.
            - StringBuffer: - Synchronized and thread safe because of synchronization it is slower.
         */


        String s1 = "PRAMOD";
        s1 = "Dutta";

        StringBuffer stringBuffer = new StringBuffer("Pramod");
        // change the value of practiceJava.string - Buffer
        stringBuffer.append("Dutta"); //PramodDutta
        stringBuffer.append("JI"); //PramodDutta

        StringBuilder stringBuilder = new StringBuilder("Amit");
        stringBuilder.append("Sharma");
        System.out.println("-----------------------------------------------------");

        StringBuilder sbd = new StringBuilder("Radha"); //not thread safe
        sbd.append("-Krishna");
        sbd.append(" Gopika");
        System.out.println(sbd);
        System.out.println(sbd.reverse().toString());


    }
}
