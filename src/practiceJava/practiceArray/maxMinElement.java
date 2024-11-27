package practiceJava.practiceArray;

import java.util.Scanner;

public class maxMinElement {
    public static int min(int[] a){
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if(min < a[i]){
                min = a[i];
            }
        }
        return min;
    }
    public static int max(int[] a){
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if(max > a[i]){
                max = a[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];

        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter a integer " + (i+1));
            a[i] = sc.nextInt();
        }

        int min = min(a);
        int max = max(a);

        System.out.println("Minimum number is " + min);
        System.out.println("Maximum number is " + max);
    }
}

