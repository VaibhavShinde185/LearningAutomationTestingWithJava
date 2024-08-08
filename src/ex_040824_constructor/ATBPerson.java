package ex_040824_constructor;

public class ATBPerson {
    String name;
    long phoneNO;

    //DC - Default Constructor
    ATBPerson() {
        System.out.println("Object is created! ");
    }

    //PM - Constructor with parameters
     ATBPerson(String name, long phoneNO) {
        this.name = name;
        this.phoneNO = phoneNO;
    }
}
