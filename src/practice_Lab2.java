import ex_180824.ThrowsAndThrow.Bank;

import java.time.LocalDate;
import java.time.Year;
import java.util.Scanner;

public class practice_Lab2 {
    public static void main(String[] args) {
        int num1 = 12, num2 = 18;
        System.out.println("The GCD of " + num1 + " and " + num2 + " is " + findGCD(num1, num2));
        System.out.println("The lcm of " + num1 + " and " + num2 + " is " + findLCM(num1, num2));

    }

        static int findGCD(int a, int b){

            while (b != 0){
                int temp = b;
                b = a % b;
                a = temp;
            }

        return  a;
        }

        static int findLCM(int a, int b){

            int lcm = (a * b) / findGCD(a, b);
            return lcm;
        }

}


