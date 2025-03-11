package ex_040824_constructorInheritanceAccessModifier.constructor;

public class ATBPerson {
    String name;
    long phoneNO;

    //DC - Default Constructor
    ATBPerson() {
        name = "Alex";
        phoneNO = 986924799;
        System.out.println("Object is created! ");
    }

    //PM - Constructor with parameters
     ATBPerson(String name, long phoneNO) {
        this.name = name;
        this.phoneNO = phoneNO;
    }
}
