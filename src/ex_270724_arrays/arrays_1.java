package ex_270724_arrays;

import java.util.Scanner;

public class arrays_1 {
    public static void main(String[] args) {

        //How to print a one dimensional array?
        // Method 1:
        int marks_ssc[] = {90,95,85,92,98,78};

        //One dimensional array
        //length of array is 6 , -> index of array start from 0 to 5
        System.out.println(marks_ssc.length);
        System.out.println(marks_ssc[3]);
        System.out.println(marks_ssc[0]);
        System.out.println("----------------------------------------------------");
      //  System.out.println(marks[-1]); //ArrayIndexOutOfBoundsException


        //Method 2: -> new keyword
        int marks_hsc[] = new int[5];
        System.out.println(marks_hsc[0]);
        System.out.println("----------------------------------------------------------");
        Scanner sc = new Scanner(System.in);
        marks_hsc[0]=sc.nextInt();
        System.out.println("Entered number is at the 0 index of aaray list");
        marks_hsc[1]=sc.nextInt();
        System.out.println("Entered number is at the 1 index of aaray list");
        marks_hsc[2]=98;
        marks_hsc[3]=89;
        marks_hsc[4]=90;

        System.out.println(marks_hsc[0]);
        System.out.println(marks_hsc[1]);
        System.out.println(marks_hsc[2]);
        System.out.println(marks_hsc[3]);
        System.out.println(marks_hsc[4]);

        System.out.println("----------------------------------------------------");

        boolean [] isMarried = {true, false, true, true};
        for (int i = 0; i < isMarried.length; i++) {
            System.out.println(i + " -> " + isMarried[i]);


        // String weekDays[] =

        }

    }
}
