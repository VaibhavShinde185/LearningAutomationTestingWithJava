package ex_110824_abstractionInterface.Interface.ex2;

public class Lab191 {
    public static void main(String[] args) {
        // I i = new I():

        interface I{}
        class A{} // concrete
        class B{}
        abstract class C{}
        class Test1 extends  A{} // Ok?
        class Test2 extends B{}
// class Test3 extends A,B{} // Multiple Inheritance
        class Test0 implements I{}
        interface I1{ }
        interface I2{}


//class Test6 implements I1 extends A{}    // not Ok/ possible
//interface I3 extends A{}                  // interface can not extend anything
//interface I4 implements A{}               // interface can not implements concrete class
//interface I5 extends A,B{}                // not possible
        interface I6 extends I1,I2{}                // interface can extend anpother interfaac e
//interface I7  extends C{}         // can not possible


        class Test4 implements I1,I2{} // multiple Inheritance with interface
        class Test5 extends A implements I1,I2{}  // possible


    }
}

