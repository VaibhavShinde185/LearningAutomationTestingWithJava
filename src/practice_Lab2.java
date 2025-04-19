import java.lang.invoke.SwitchPoint;
import java.util.Arrays;
import java.util.Scanner;

public class practice_Lab2 {
    public static void main(String[] args) {

        String s1 = "Vaibhav";
        System.out.println(s1);
        System.out.println("-------------------------------------------");

        StringBuffer sbf = new StringBuffer("Vaibhav");
        sbf.append(" Shinde");
        sbf.append(" Ji");
        System.out.println(sbf);
        System.out.println("----------------------------------------------");

        StringBuilder sbd = new StringBuilder("Vaibhav ");
        sbd.append("Vishnu ");
        sbd.append("Shinde ");
        System.out.println(sbd);
        System.out.println("-------------------------------------------------");
        System.out.println(sbd.reverse());

    }
}

