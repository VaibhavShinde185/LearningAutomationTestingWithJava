package practiceJava;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;
public class practice_Lab3 {
    public static void main(String[] args) {

     int[][] array2d = {
             {34,1},
             {34,2},
             {34,3}
     };

        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                System.out.print(array2d[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
