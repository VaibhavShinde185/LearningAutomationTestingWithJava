package ex_270724_arrays;

import java.util.Scanner;

public class arrays_1 {
    public static void main(String[] args) {

        //How to print a one dimensional array?
        // Method 1:
        int marks_ssc[] = {90,95,85,92,98,78};

        //One dimensional array
        //length of array is 6 , -> index of array start from 0 to 5
        System.out.println(marks_ssc.length);           //6
        System.out.println(marks_ssc[3]);               //92
        System.out.println(marks_ssc[0]);               //90
        System.out.println("----------------------------------------------------");
      //  System.out.println(marks[-1]); //ArrayIndexOutOfBoundsException


        //Method 2: -> new keyword
        int marks_hsc[] = new int[5];
        System.out.println(marks_hsc[0]);               //0
        System.out.println("----------------------------------------------------------");
        Scanner sc = new Scanner(System.in);

        System.out.println("Entered number is at the 0 index of aaray list");       //user input for 0 index
        marks_hsc[0]=sc.nextInt();

        System.out.println("Entered number is at the 1 index of aaray list");       //user input for index 1
        marks_hsc[1]=sc.nextInt();

        marks_hsc[2]=98;
        marks_hsc[3]=89;
        marks_hsc[4]=90;

        System.out.println(marks_hsc[0]);           //user input
        System.out.println(marks_hsc[1]);           //user input
        System.out.println(marks_hsc[2]);           //98
        System.out.println(marks_hsc[3]);           //89
        System.out.println(marks_hsc[4]);           //90

        System.out.println("----------------------------------------------------");

        boolean [] isMarried = {true, false, true, true};
        for (int i = 0; i < isMarried.length; i++) {
            System.out.println(i + " -> " + isMarried[i]);      // T,F,T,T each on new line


        // String weekDays[] =

        }
        System.out.println("----------------------------------------------------");
        //Scanner sc = new Scanner(System.in);

        float marks[] = new float[5];
        System.out.println(marks[0]);
        System.out.println("---------------------------------------------");

        System.out.println("Enter marks of subject 1: ");
        marks[0] = sc.nextFloat();

        System.out.println("Enter marks of subject 2: ");
        marks[1] = sc.nextFloat();

        marks[2] = 93;
        marks[3] = 94;
        marks[4] = 95;

        System.out.println("Array length is " + marks.length);
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Marks of subject "+ (i+1) + " :" + marks[i]);
        }
        sc.close();

    }
}
