package ex_110824_abstractionInterface.abstraction.excar;

abstract class car extends  engine{
//    Engine
//    Gearbox
//    Keys
//
//    GWagon is a car
//    GWagon drive()


    @Override
    void start() {
        System.out.println("Start a car - class: engine");
    }

    @Override
    void stop() {
        System.out.println("Stop a car - class: engine");
    }

    @Override
    void partGearBox() {
        System.out.println("part of gearbox - class: gearBox");
    }

    @Override
    void openCar() {
        System.out.println("Open a car - class: keys");
    }
}
