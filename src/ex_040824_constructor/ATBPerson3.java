package ex_040824_constructor;

public class ATBPerson3 {
    public static void main(String[] args) {
        ATBPerson a1 = new ATBPerson();
        //a1.name = "Vaibhav";      //after the object creation
        System.out.println(a1.name);
        System.out.println(a1.phoneNO);

        ATBPerson a2 = new ATBPerson("Vaibhav",980049870);
        System.out.println(a2.name);
        System.out.println(a2.phoneNO);

    }
}
