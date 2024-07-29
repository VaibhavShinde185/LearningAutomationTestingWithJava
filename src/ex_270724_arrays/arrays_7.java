package ex_270724_arrays;

public class arrays_7 {
    public static void main(String[] args) {
        // Single-dimensional arrays
        //  have only one dimension, representing a list of elements.
//        int [] ages = {90,91,93};
//        int [] ages2 = new int[10];

        // Multi-dimensional arrays
        //  have two or more dimensions, representing a table or grid of elements.
//        int[][] array_2d_2 = new int[3][3];

        int[][] array_2d = {
                {34, 12, 11},
                {34, 12, 34},
                {11, 23, 98}
        };

        for (int i=0;i<array_2d.length; i++){
            for (int j= 0; j<array_2d[i].length; j++){
                System.out.print(array_2d[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }

    }
}
