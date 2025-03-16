package ex_170824.SIBandIIB;

public class lab199 {
    public static void main(String[] args) {
        A a = new A();
        A a2 = new A();

        a.age = 12;
        System.out.println(A.discount);
        System.out.println(a.age);
        a.m2();     // for calling non static method we require an object of that class
        A.m1();     // for calling Static method, does not require an object. we can call directly using "className.staticmethodName".

        // Static don't need object ref. - True
    }
}

class A{
    int age  = 10; // Instance variable
    static int discount = 199; // static variable

    // SIB - STATIC initialization block
    static {
        System.out.println("One Time Load SIB");
    }

    // IIB - instance initialization block
    {
        System.out.println("IIB When Object is created");
        System.out.println(age);
    }

    static void m1(){
        System.out.println("m1");
        System.out.println(discount);

    }
    void m2(){
        System.out.println("m2");
        System.out.println(discount);
    }
}
