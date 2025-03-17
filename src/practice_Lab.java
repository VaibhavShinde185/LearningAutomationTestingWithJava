import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
public class practice_Lab {
    public static void main(String[] args) {

        System.out.println("Start of the program");
        int a = 0;

        try {
            int b = 10 / a;
        } catch (Exception e) {
            System.out.println("Value of a should not be 0");
            e.getMessage();
            throw new RuntimeException(e);
        } finally {
            System.out.println("I will be executed anyhow");
        }

        System.out.println("End of the program");

    }
    }


