package ex_logicBuilder;

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a year, i will tell you weather it is leap year or not a leap year");
        int year = sc.nextInt();

        if ( year % 2 == 0){
            System.out.println("It is a leap year!");
        } else {
            System.out.println("It is not a leap year!");
        }

    }

}