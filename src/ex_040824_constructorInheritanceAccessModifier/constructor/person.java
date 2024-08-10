package ex_040824_constructorInheritanceAccessModifier.constructor;

public class person {
    String name;

    //constructor
    person() {
        System.out.println("Hi,i will be called when object is created.");
    }

    void talk(){
        System.out.println("I am talking! ");
    }
}
