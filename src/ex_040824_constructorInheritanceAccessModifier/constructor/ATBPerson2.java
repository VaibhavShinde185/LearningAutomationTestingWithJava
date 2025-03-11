package ex_040824_constructorInheritanceAccessModifier.constructor;

public class ATBPerson2 {
    public static void main(String[] args) {
        ATBPerson a1 = new ATBPerson();
        new ATBPerson();
        new ATBPerson();
        System.out.println(a1.name);
        ATBPerson a2 = null;
    }
}
