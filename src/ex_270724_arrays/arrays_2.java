package ex_270724_arrays;

import java.util.Scanner;

public class arrays_2 {
    public static void main(String[] args) {

        int marks[] = new int[3];

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = 90;
        marks[2] = 96;

        for (int i=0; i<marks.length; i++)
        {
            System.out.println(i + " -> " + marks[i]);
        }
    }
}
