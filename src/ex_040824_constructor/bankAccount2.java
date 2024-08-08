package ex_040824_constructor;

public class bankAccount2 {
    public static void main(String[] args) {
        bankAccount b1 = new bankAccount();
        System.out.println(b1.bankName);
        System.out.println(b1.balance);
        System.out.println(b1.bankCode);

        bankAccount bICICI = new bankAccount("ICICI", 500000, "ICICN999");
        System.out.println(bICICI.bankName);
        System.out.println(bICICI.balance);
        System.out.println(bICICI.bankCode);

        bICICI.printDetails();
        // b1.printDetails();

    }
}
