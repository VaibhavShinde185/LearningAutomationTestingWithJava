// Find the Max in the Arrays
// Find the Max Salary, Min  in the Salary Array


import java.util.Scanner;

public class practice_Lab2 {
    public static int addition(int[] a) {
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
        int sum = addition(a);
        System.out.println("Addition of array element is " + sum);
    }
}





// Lab147  -- sort function
// Lab151,Lab152,Lab153
