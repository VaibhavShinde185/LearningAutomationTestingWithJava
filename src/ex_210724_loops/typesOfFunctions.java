package ex_210724_loops;
import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class typesOfFunctions {
    public static void main(String[] args) {
        function_type1();
        System.out.println(" --------------- ");

        String name = function_type2();
        System.out.println(name);
        System.out.println(" --------------- ");
    }


        //  1.Without Parameters and Without Return Type
        static void function_type1() {
            System.out.println("1.Without Parameters and Without Return Type");
        }
        // 2.Without Parameters but With Return Type
        static String function_type2() {
            System.out.println("2.Without Parameters but With Return Type");
            return "Jack";
        }

}

