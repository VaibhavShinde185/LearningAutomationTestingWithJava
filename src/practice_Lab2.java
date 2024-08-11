// Find the Max in the Arrays
// Find the Max Salary, Min  in the Salary Array


import java.util.Scanner;

public class practice_Lab2 {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int[][] a = new int[3][5];

            // Input array elements
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    System.out.print("Enter value for a[" + i + "][" + j + "]: ");
                    a[i][j] = sc.nextInt();
                }
            }

            System.out.println("Entered array elements are:");

            // Print array elements with indices
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    // Highlighted part: printing index with the value
                    System.out.print("a[" + i + "][" + j + "]=" + a[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }

