import javax.sound.midi.Soundbank;
import java.lang.invoke.SwitchPoint;
import java.util.Arrays;
import java.util.Scanner;

public class practice_Lab2 {
    String bankName;
    String ifscCode;
    int bankBalance;

    practice_Lab2(){
        bankName = "SBI";
        ifscCode = "sbin0001";
        bankBalance = 9999;
    }

    practice_Lab2(String bankName, String ifscCode, int bankBalance){
        this.bankName = bankName;
        this.ifscCode = ifscCode;
        this.bankBalance = bankBalance;
    }

    void printDetails(){
        System.out.println("Bank Name is " + bankName);
        System.out.println("Bank IFSC code is " + ifscCode);
        System.out.println("Bank balance is " + bankBalance);
    }

}
