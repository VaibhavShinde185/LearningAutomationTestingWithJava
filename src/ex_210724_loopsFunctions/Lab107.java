package ex_210724_loopsFunctions;

import java.util.Scanner;

public class Lab107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int a = sc.nextInt();

        int i = 1;
        while (i<=10){
            int b = a*i;
            {
                System.out.println(b);
                i++;
            }
        }
    }
}


/*
for ( int i = 1; i <= 10; i++) {
            int b = a*i;
            {
                System.out.println(b);
            }
        }
 */