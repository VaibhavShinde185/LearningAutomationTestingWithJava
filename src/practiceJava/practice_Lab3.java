package practiceJava;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;
public class practice_Lab3 {
    public static void main(String[] args) {

        dog d = new dog();
        d.bark();

        hound h = new hound();
        h.bark();
        h.bike();

        dog abc = new hound();
        abc.bark();
    }
}

class dog{
    void bark(){
        System.out.println("I am dog, I will bark.");
    }
}

class hound extends dog {
    void bark(){
        System.out.println("I am hound, i will bark and bite as well.");
    }

    void bike(){
        System.out.println("I can sit on bike too.");
    }

}