package ex_170824.nestedClasses;

public class lab202 {
    public static void main(String[] args) {
        Car c = new Car("Lambo");
        c.drive();
//        System.out.println(c.make);
        // to access the inner class Object creation.
        Car.GearBox cg = c.new GearBox();
        cg.m2();
    }
}

class Car {
    private String make;

    public Car(String make) {
        this.make = make;
    }

    // Method
    void drive() {
        System.out.println("You can drive a Car");
    }

    class GearBox {
        void m2() {
            System.out.println("m2");
        }
        class NutBolts{
        }
    }
}
