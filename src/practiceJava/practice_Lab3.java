package practiceJava;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;
public class practice_Lab3 {
    public static void main(String[] args) {
        chrome c =  new chrome();

        String r1 = c.openBrowser();
        System.out.println(r1 + "\n");

        String r2 = c.closeBrowser();
        System.out.println(r2 + "\n");

        String r3 = c.takeScreenshot();
        System.out.println(r3 + "\n");



    }
}

abstract class baseClass{
    abstract String openBrowser();
    abstract String closeBrowser();
    abstract String takeScreenshot();
}

