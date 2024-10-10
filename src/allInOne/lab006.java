package allInOne;

import java.util.Scanner;

public class lab006 {
    /**
     Write a program that calculates and displays the letter grade for a given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:
     A: 90-100   B: 80-89    C: 70-79   D: 60-69    F: 0-59
     */

    public static void main(String[] args) {
        char grade;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks, i will tell your grade!");
        int marks = sc.nextInt();

        if (marks >= 90 && marks <= 100){
            grade = 'A';
        } else if (marks >= 80 && marks <= 89){
            grade = 'B';
        } else if (marks >= 70 && marks <= 79){
            grade = 'C';
        } else if (marks >= 60 && marks <= 69){
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Your grade is " + grade);
        }
    }

