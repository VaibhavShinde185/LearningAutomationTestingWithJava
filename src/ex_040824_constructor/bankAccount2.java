package ex_040824_constructor;

import java.util.Scanner;

public class bankAccount2 {
    public static void main(String[] args) {
//        bankAccount b1 = new bankAccount();     //calling DC
//        System.out.println(b1.bankName);
//        System.out.println(b1.balance);
//        System.out.println(b1.bankCode);
//
//        bankAccount bICICI = new bankAccount("ICICI", 500000, "ICICN999");   //calling PC
//        System.out.println(bICICI.bankName);
//        System.out.println(bICICI.balance);
//        System.out.println(bICICI.bankCode);
//
//        bICICI.printDetails();
//        b1.printDetails();


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the bank name where you have your bank account " );
        String bankName = sc.next();

        System.out.println("Tell me how much balance do you have in your account: " );
        int balance = sc.nextInt();

        System.out.println("What is your bank code: " );
        String bankCode = sc.next();

        bankAccount bUserInput = new bankAccount(bankName, balance, bankCode);  //calling PC with user input

        bUserInput.printDetails();
    }
}
