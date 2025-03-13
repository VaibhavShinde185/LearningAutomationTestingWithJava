package ex_100824.encapsulationPloymorphism.superThisKeyword;

public class superKeyword3 {
    // super.variable
    // super.method()
    // super() -> DC
    // super("pramod') -> PC
    // this()
    // this.variableName
    public static void main(String[] args) {
        new Student1();


    }
}

class Person1 {
    Person1() {
        System.out.println("Person1 - DC");
    }

    Person1(String a) {
        System.out.println("Person1 - PC A1");
    }

    Person1(String a, int a1) {
        System.out.println("Person1  - PC A2");
    }
}
class Student1 extends Person1{
    int a = 10;

    Student1(String s){
        System.out.println("PC -Student");
    }

    Student1(){
        super();            // calling a default constructor of parent class
//          this("abc");
//        super("Pramod");
//        super("pramod",12);
    }


}
