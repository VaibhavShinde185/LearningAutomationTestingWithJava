package practiceJava.practiceArray;

import java.util.Scanner;
//Taking user input and calculating Addition of the entered array element
public class takingInput {
    public static int additionOfArrayElement(int[] a){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];

        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter a integer " + (i+1));
            a[i] = sc.nextInt();
        }
        System.out.println();

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println();

        System.out.println("---------------------------------------------");
        int sum = additionOfArrayElement(a);
        System.out.println("Addition of the entered array element is " + sum);

    }
}
