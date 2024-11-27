package practiceJava.practiceArray;

import java.util.Scanner;

public class array2DInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][5];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print("Enter value for a[" + i +"]" + "[" + j + "]: ");
                a[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("Entered array elements are ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }

    }
}
