import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class practice_Lab2 {
        public static void main(String[] args) {

        int[] marks = new int[3];
            System.out.println(marks[0]);
            System.out.println(marks[1]);
            System.out.println(marks[2]);

            Scanner sc = new Scanner(System.in);
            marks[0] = sc.nextInt();
            marks[1] = 92;
            marks[2] = 93;

            for (int i = 0; i < marks.length; i++) {
                System.out.println(i + ":" + marks[i]);
            }

        }
    }

