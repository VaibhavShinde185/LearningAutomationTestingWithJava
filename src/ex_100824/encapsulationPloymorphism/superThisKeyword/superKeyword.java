//package ex_100824.encapsulationPloymorphism.superThisKeyword;
//
//import ex_040824_constructorInheritanceAccessModifier.hasA.car;
//
//public class superKeyword {
//    // super()
//    //1. Use of super with Variables
//    //2. Use of super with Methods
//    //3. Use of super with constructors
//
//    // super keyword in Java is a reference variable that allows a subclass - child class to refer to its parent class.
//
//    public static void main(String[] args) {
//        Gadi g = new Gadi();
//        g.display();
//    }
//
//    class Gadi extends vehicle{
//        private int maxSpeed = 270;
//
//        Gadi(){
//            super(10);
//            System.out.println("DC car");
//        }
//
//        public void display(){
//            System.out.println("Car speed is " + this.maxSpeed);
//            System.out.println("Vehicle speed is " + super.maxSpeed);
//            super.message();
//            this.message();
//        }
//    }
//
//    class vehicle{
//        public int maxSpeed = 180;
//
//        public vehicle(){
//            System.out.println("Default Constructor");
//        }
//
//        public vehicle(int a) {
//            System.out.println("Parameterized Constructor");
//        }
//
//        void message(){
//            System.out.println("Hello Vehicle - without params");
//        }
//
//        void message(int a){
//            System.out.println("Hello Vehicle - with parameters");
//        }
//    }
//
//}