// Find the Max in the Arrays
// Find the Max Salary, Min  in the Salary Array


import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class practice_Lab2 {
        public static void main(String[] args) {

           /* Create a program that determines whether a given year is a leap year.
           A leap year is divisible by 4, but not by 100 unless it is also divisible by 400. Use an if-else statement to make this determination.
            */

        Scanner sc = new Scanner(System.in);
            System.out.println("Enter a year, it would tell you weather it is a leap year or not");
            int year = sc.nextInt();

            if ((year % 4 == 0 && year % 100 != 0 )|| year % 400 == 0 ){
                System.out.println("Leap year");
            } else {
                System.out.println("Not a leap year");
            }


        }
    }

