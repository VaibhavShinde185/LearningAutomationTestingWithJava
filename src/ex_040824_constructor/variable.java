package ex_040824_constructor;

public class variable {
    int a = 45;   //Instance variable

    //Instance variable != Local variable
    //In java there is no concept of instance variable

    void f1(){
        int a = 21;  // local variable
        System.out.println(a);
    }

    void f2(){
        System.out.println(a);
    }
}
