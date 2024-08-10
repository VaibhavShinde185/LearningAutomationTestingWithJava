package ex_040824_constructorInheritanceAccessModifier.hierachicalInheritance;

public class fatherChildDaughter {
    public static void main(String[] args) {
        daughter1 d = new daughter1();
        d.home3();
        d.home1();

        child1 c1 = new child1();
        c1.home2();
        c1.home1();

    }
}
