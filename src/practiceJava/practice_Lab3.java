package practiceJava;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;
public class practice_Lab3 {
    public static void main(String[] args) {

        printMyBook p = new printMyBook();
        p.getDetails();

    }
}

abstract class book{
    abstract void getDetails();
}

class printMyBook extends book{


    @Override
    void getDetails() {

    }
}