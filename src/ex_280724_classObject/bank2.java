package ex_280724_classObject;

public class bank2 {
    public static void main(String[] args) {
        bank b1 = new bank();
        bank b2 = new bank();

        b1.name = "SBI";
        b2.name = "ICICI";

        System.out.println(b1.name);
        System.out.println(b2.name);
        System.out.println(b2.balance);
        b1.withDraw();
        b1.addBalance();

        b2.balance = 100;
        System.out.println(b2.balance);
        System.out.println(b1.balance);
    }
}
