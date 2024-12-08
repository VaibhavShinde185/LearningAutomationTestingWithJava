import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class practice_Lab2 {
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a student name ");
        String name = sc.next();

        float marks[] = new float[5];
            for (int i = 0; i < marks.length; i++) {
                System.out.println("Enter marks of subject " + (i+1));
                marks[i] = sc.nextFloat();
            }

            float avg = (marks[0]+marks[1]+marks[2]+marks[3]+marks[4])/5;
            System.out.println("Average is " + avg);

        }
    }

