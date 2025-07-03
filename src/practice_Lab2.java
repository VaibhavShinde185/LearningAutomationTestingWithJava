import ex_180824.ThrowsAndThrow.Bank;

import javax.sound.midi.Soundbank;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.invoke.SwitchPoint;
import java.util.*;

public class practice_Lab2 {
    public static void main(String[] args) {


        Stack s = new Stack();
        s.push("Vaibhav");
        s.push("Viraj");
        s.push("VVVVVV");
        s.push("BMC");
        s.push("AMC");
        s.push("MOI");

        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.push("AMC"));
        System.out.println(s);



    }
}
