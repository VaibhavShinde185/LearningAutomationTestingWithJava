package ex_logicBuilder;

import java.util.Scanner;

public class traingleClassifier {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a length of side 1");
        int side_A = sc.nextInt();
        System.out.println("Enter a length of side 2");
        int side_B = sc.nextInt();
        System.out.println("Enter a length of side 3");
        int side_C = sc.nextInt();
        System.out.println("Entered length is in centimeters");

        if (side_A == side_B && side_B == side_C) {
            System.out.println("According to the given input, it is a equilateral triangle");
        } else if (side_A == side_B || side_B == side_C || side_A == side_C) {
            System.out.println("According to the given input, it is a isosceles triangle");
        } else {
            System.out.println("According to the given input, it is a scalene triangle");
        }
    }
}
