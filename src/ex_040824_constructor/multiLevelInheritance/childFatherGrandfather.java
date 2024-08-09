package ex_040824_constructor.multiLevelInheritance;

public class childFatherGrandfather {
    public static void main(String[] args) {
        child c = new child();
        c.home(); //if the method name is same then compiler run a local variable
        // i.e sub class variable first then super class variable after that super super class variable

        c.extra();
        c.c();
        c.f();
        c.gF();
    }
}
