import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
public class practice_Lab {
    public static void main(String[] args) {

        int[] salaries = {7, 10, 4, 13, 25, 18, 9, 8, 17};
        int max = salaries[0];
        int min = salaries[0];

        for (int i = 0; i < salaries.length; i++) {
            if ( max < salaries[i]){
                max = salaries[i];

        } else if (salaries[i] < min){
            min = salaries[i];
            }
        }
        System.out.println("Second highest salary is "+ max);
        }

    }

