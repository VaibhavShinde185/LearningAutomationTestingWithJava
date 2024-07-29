package ex_210724_loops;
import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class typesOfFunctions {
    public static void main(String[] args) {
        A();
        System.out.println("-----------------------------------------");

        String name = B();
        System.out.println(name);
        System.out.println("------------------------------------------------------");

        C("Hey! John");
        System.out.println( " ----------------------------------------------------- ");

        int sum = D(9,6);
        System.out.println("result =" + sum);
        System.out.println("-----------------------------------------------------");

    }

    static void A(){
        System.out.println("without parameter and return type");
    }

    static String B(){
        System.out.println("without parameter but with return type");
        return "Jack";
    }

    static void C(String name){
        System.out.println("With parameter but without return type");
        System.out.println(name);
    }

    static int D(int a, int b){
        System.out.println("with params and return type");
        return a+b;
        }

}

