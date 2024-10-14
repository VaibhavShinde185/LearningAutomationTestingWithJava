package allInOne;

import java.util.Scanner;

public class lab007 {
    /**
     Create a program that determines whether a given year is a leap year. A leap year is divisible by 4,
     but not by 100 unless it is also divisible by 400. Use an if-else statement to make this determination.  */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year, i will tell you weather it is leap year or not");
        int year = sc.nextInt();

        if (year % 4 == 0 && year % 100 != 0 ){
            System.out.println(year + " is a leap year");
        } else if (year % 400 == 0) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }

//        // using ternary operator
//        String result = (year % 100 == 0) ?
//                ((year % 400 == 0) ? "Leap Year" : "Not a Leap Year")
//                : ((year % 4 == 0) ? "Leap Year" : "Not a Leap Year");
//
//        System.out.println(year + " is " + result);


    }

}

