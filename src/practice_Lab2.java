import ex_180824.ThrowsAndThrow.Bank;

import javax.sound.midi.Soundbank;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.invoke.SwitchPoint;
import java.util.Arrays;
import java.util.Scanner;

public class practice_Lab2 {
    public static void main(String[] args) {
        extracted();
    }

    public static void extracted(){
        extracted1();
    }

    public static void extracted1() {
        try {
            Integer[] i = new Integer[2];
            System.out.println(i[3]);
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace()  );
        }
    }

}
