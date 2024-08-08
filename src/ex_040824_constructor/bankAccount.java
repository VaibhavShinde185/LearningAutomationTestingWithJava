package ex_040824_constructor;

public class bankAccount {
    String bankName;
    int balance;
    String bankCode;

    //DC
    public bankAccount() {
        bankName = "SBI";
        balance = 0;
        bankCode = "SBIN0009";
    }

    //PC
    public bankAccount(String bankName, int balance, String bankCode) {
        this.bankName = bankName;
        this.balance = balance;
        this.bankCode = bankCode;
    }


    void printDetails(){
        System.out.println("Bank Name: " + bankName);
        System.out.println("Bank Balance: " + balance);
        System.out.println("Bank Code: " + bankCode);
    }
}