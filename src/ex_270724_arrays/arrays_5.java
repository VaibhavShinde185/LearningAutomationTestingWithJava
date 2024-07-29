package ex_270724_arrays;

//Take user input of 5 subject marks and find the average

import java.util.Scanner;

public class arrays_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float marks[] = new float[5];

        for(int i=0; i< marks.length; i++){
            System.out.println("Enter a marks of subject " + (i+1));
            marks[i] = sc.nextFloat();
        }

        float avg = (marks[0]+marks[1]+marks[2]+marks[3]+marks[4]) / 5;
        System.out.println("Average is "+ avg);

    }
}
