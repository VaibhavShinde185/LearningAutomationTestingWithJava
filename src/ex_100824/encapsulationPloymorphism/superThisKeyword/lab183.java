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
        super(10); // Constructor Chaining
        System.out.println("DC Car");

    }

    public void display(){
        System.out.println("Car speed is -> "+ this.maxSpeed);
        System.out.println("Vehicle speed is -> "+ super.maxSpeed);
        super.message();
        this.message();

    }

    @Override
    void message() {
        System.out.println("Hello Vehicle");
    }

}

class Vehicle {
    public int maxSpeed = 180;

    Vehicle(){
        System.out.println("DC Vehicle");
    }
    Vehicle(int a){
        System.out.println("PC Vehicle");
    }


    void message() {
        System.out.println("Hello Vehicle");
    }

    void message(int a) {
        System.out.println("Hello Vehicle");
    }
}
