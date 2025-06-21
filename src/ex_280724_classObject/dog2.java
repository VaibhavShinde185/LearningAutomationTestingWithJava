package ex_280724_classObject;

public class dog2 {
    public static void main(String[] args) {

        dog dog1Ref = new dog();
        dog1Ref.name = "chow chow";
        dog1Ref.eat();
        dog1Ref.talk();

        dog dog2Ref = new dog();
        dog2Ref.name = "german shepherd";
        dog2Ref.sleep();
        dog2Ref.walk();

        // functions - perform a task , block of code
        // functions within the class are called -> methods?
        // class -> blueprint
        // object ->  real entity created from the class. / instance of the class.


    }
}
