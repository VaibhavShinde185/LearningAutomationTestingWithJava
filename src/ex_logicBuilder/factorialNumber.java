package ex_logicBuilder;

import java.util.Scanner;

public class factorialNumber {
    public static void main(String[] args) {
           /* Factorial Number
    fact(5) = 5*4*3*2*1 = 120
     */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number, i will tell you factorial");
        int n = sc.nextInt();

        int fact = 1;
        for ( int i = 1; i <= n; i++ ){
            fact = fact * i;
        }
        System.out.println("Factorial of entered number is " + fact);
    }
}

// While loop

//int n = 5;
//int fact = 1;
//int i = 1;
//     while (i<=n){
//fact = fact*i;
//i++;
//        }
//        System.out.println(fact);