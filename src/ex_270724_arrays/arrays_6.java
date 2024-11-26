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

        // Sort -> find the last one -
//        Arrays.sort(salaries);
//        System.out.println(salaries[salaries.length-1]);

        Arrays.sort(salaries);
        System.out.println(salaries[salaries.length-2]);

    }

}
