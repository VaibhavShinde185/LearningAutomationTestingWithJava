import javax.sound.midi.Soundbank;
import java.lang.invoke.SwitchPoint;
import java.util.Arrays;
import java.util.Scanner;

public class practice_Lab2 {
    public static void main(String[] args) {

        int[][] array_2d = {
                {34, 12, 11, 15},
                {34, 12, 34, 18},
                {11, 23, 98, 21}
        };

        for (int i = 0; i < array_2d.length; i++) {
            for (int j = 0; j < array_2d[i].length; j++) {
                System.out.print(array_2d[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
