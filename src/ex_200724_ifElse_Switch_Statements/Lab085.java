package ex_200724_ifElse_Switch_Statements;
/*        ✅ Grade Calculator:
        Write a program that calculates and displays the letter grade for a given numerical score (e.g., A, B, C, D, or F)
        based on the following grading scale:
        A: 90-100
        B: 80-89
        C: 70-79
        D: 60-69
        F: 0-59
 */

import java.util.Scanner;

public class Lab085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student score!");
        int score = sc.nextInt();

        char grade = 'F';
        if (score >= 90 && score <= 100){
            grade ='A';
        } else if
        (score >= 80 && score <= 89){
            grade ='B';
        } else if
        (score >= 70 && score <= 79){
            grade ='C';
        } else if (score >= 60 && score <= 69){
            grade ='D';
        } else
        {
            grade ='F';
        }

        System.out.println("Your grade is " + grade);

    }
}
