package ex_040824_constructorInheritanceAccessModifier.singleInheritance;

public class fatherSon {
    public static void main(String[] args) {

        son s = new son();
        s.bhk3();
        s.bhk2();

        father f = new father();
        f.bhk2();
//        f.bhk3(); //unable to invoke bCoz class son *IS A RELATION* with class father


//        System.out.println("This is a example of Has A relation!");
//        new son().bhk3();
//        new father().bhk2();

    }
}
