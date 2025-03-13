package ex_100824.encapsulationPloymorphism.superThisKeyword;

public class lab183 {
    public static void main(String[] args) {
        Car s = new Car();
        s.display();
    }
}

class Car extends Vehicle {
    private int maxSpeed = 281;

    Car(){
        super(10); // Constructor Chaining  -> calling constructor of super class
      //   super();
        System.out.println("DC Car - Statement within a constructor");
    }

    public void display(){
        System.out.println("Car speed is -> "+ this.maxSpeed);
        System.out.println("Vehicle speed is -> "+ super.maxSpeed);
        super.message();
        super.message(999);            // if param is not passed then is compiler assign a null value for this variable
        this.message();
    }
    @Override
    void message() {
        System.out.println("Hello Vehicle This is Child class");
    }
}

class Vehicle {
    public int maxSpeed = 180;
    Vehicle(){
        System.out.println("DC Vehicle");
    }
    Vehicle(int a){
        System.out.println("PC Vehicle - parameterized constructor");
    }
    void message() {
        System.out.println("Hello Vehicle - method without params - This is parent class");
    }
    void message(int b) {
        System.out.println("Hello Vehicle - method with params! - This is parent class");
    }
}
