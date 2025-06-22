package ex_040824_constructorInheritanceAccessModifier;

public class variable {
        int a = 45;   //Instance variable

        //Instance variable != Local variable
        //In java there is no concept of global variable

        void f1() {
            int a = 21;  // local variable
            System.out.println(a);
        }

        void f2() {
            System.out.println(a);
        }

    public static void main(String[] args) {
        variable v = new variable();
        System.out.print("Printing the local variable.");
        System.out.println();
        v.f1();
        System.out.println("-----------------------------------------------------");
        System.out.print("Printing the instance variable");
        System.out.println();
        v.f2();
    }

}

