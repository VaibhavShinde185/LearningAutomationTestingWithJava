package ex_110824_abstractionInterface.excar;

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
        System.out.println("G - Wagon");
    }

    @Override
    void openCar() {
        System.out.println("Open a car");
    }
}

