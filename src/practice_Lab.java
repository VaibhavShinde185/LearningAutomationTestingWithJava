import javax.sound.midi.Soundbank;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
public class practice_Lab {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();

    if(x == 0){
        throw new ArithmeticException("Enter a non 0 number");
    }

    int a = 10/ x;
        System.out.println(a);
    }
}


