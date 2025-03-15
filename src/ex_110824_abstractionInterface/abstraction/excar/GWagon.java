package ex_110824_abstractionInterface.abstraction.excar;

public class GWagon extends engine{
        void drive(){
            openCar();
            start();
            partGearBox();
            stop();
        }

    @Override
    void start() {
        System.out.println("Starting a G- Wagon");
    }

    @Override
    void stop() {
        System.out.println("Stopping a G - Wagon");
    }

    @Override
    void speed() {
        System.out.println("369 Km/ hr");
    }

    @Override
    void partGearBox() {
        System.out.println("G - Wagon Gear Box");
    }

    @Override
    void openCar() {
        System.out.println("Open a car");
    }
}

