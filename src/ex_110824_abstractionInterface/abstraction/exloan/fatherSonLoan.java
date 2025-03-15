package ex_110824_abstractionInterface.abstraction.exloan;

public class fatherSonLoan {
    public static void main(String[] args) {
        son s = new son();
        s.loan50K();
        s.loan();
        System.out.println("------------------------");


        father f1 = new son();  //Dynamic Dispatch
        f1.loan50K();
        f1.loan();
    }
}

// We can not create a object of abstract class
