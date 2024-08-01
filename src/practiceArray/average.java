package practiceArray;

import java.util.Scanner;

public class average {
    public static int avg(int[] a){
        int avg = ((a[0]+a[1]+a[2]+a[3]+a[4])/5);
        return avg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];

        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter a number " + (i+1));
            a[i] = sc.nextInt();
        }
        int avg = avg(a);
        System.out.println("Average of entered array is " + avg);
    }
}
