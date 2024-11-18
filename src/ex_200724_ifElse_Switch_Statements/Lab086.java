package ex_200724_ifElse_Switch_Statements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab086 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day from 1 to 7, Tell What day it is");
        int day = sc.nextInt();

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("No idea, what day it is");
                break;
        }

        System.out.println("--- Outside the switch block ---");

        }

    }
