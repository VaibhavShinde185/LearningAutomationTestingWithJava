package ex_270724_arrays;

import java.util.Arrays;

public class arrays_6 {
    public static void main(String[] args) {
        int[] salaries = {7, 10, 4, 13, 25, 18, 9, 8, 17};
        int max = salaries[0];
        int min = salaries[0];

        for (int i=0; i<salaries.length; i++){
            if (salaries[i]> max){
                max = salaries[i];
            } else if (salaries[i]<min){
                min = salaries[i];
            }
            }

        System.out.println("maximum salary is "+max);
        System.out.println("minimum salary is "+min);

        int secondHighest = min;

        for (int i = 0; i < salaries.length; i++) {
            if (salaries[i] > secondHighest && salaries[i] < max){
                secondHighest = salaries[i];
            }
        }
        System.out.println("Second highest salary is " + secondHighest);

        System.out.println("------------------------------------------------------");
        System.out.println("\n");

        System.out.println("Finding maximum and minimum salary by using Arrays.sort()");

        // Sort -> find the last one -
        Arrays.sort(salaries);
        int max_A = salaries[salaries.length - 1];
        int min_A = salaries[0];

        System.out.println("Maximum salary is " + max_A);
        System.out.println("Maximum salary is " + min_A);

//        Arrays.sort(salaries);
//        System.out.println(salaries[salaries.length-2]);

    }
}
