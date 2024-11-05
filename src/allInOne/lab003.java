package allInOne;

import java.sql.SQLOutput;
import java.util.Scanner;

public class lab003 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Hello! " + name + "." + " Welcome to the Java coding practice. " + "Your age is " + age + ".");

        if (age >= 27){
            System.out.println("You are starting late but it is okay if you will give one hour daily to the coding practice then you can learn it within 6 months.");
        } else {
            System.out.println("You started before it late. Do practice consistently.");
        }

        sc.close();

    }
}
