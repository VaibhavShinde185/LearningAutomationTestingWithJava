package ex_210724_loops;

import java.util.Scanner;

public class Lab108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        int i = 1;

        do{
            int b = a*i;
            System.out.println(b);
            i++;
        }
        while(i<=10);
    }
}
