import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
public class practice_Lab {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    float marks[] = new float[5];
        System.out.println(marks[0]);
        System.out.println("---------------------------------------------");

        System.out.println("Enter marks of subject 1: ");
        marks[0] = sc.nextFloat();

        System.out.println("Enter marks of subject 2: ");
        marks[1] = sc.nextFloat();

        marks[2] = 93;
        marks[3] = 94;
        marks[4] = 95;

        System.out.println("Array length is " + marks.length);
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Marks of subject "+ (i+1) + " :" + marks[i]);
        }
            sc.close();
        }
    }


