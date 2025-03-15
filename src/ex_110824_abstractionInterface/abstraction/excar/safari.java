package ex_110824_abstractionInterface.abstraction.excar;

public class safari extends engine{
    void drive(){
        openCar();
        start();
        partGearBox();
        speed();
        stop();
    }

    @Override
    void start() {
        System.out.println("Starting a Tata Safari");
    }

    @Override
    void stop() {
        System.out.println("Stopping a Tata Safari");
    }

    @Override
    void speed() {
        System.out.println("270 Km/ hr");
    }

    @Override
    void partGearBox() {
        System.out.println("Tata Safari");
    }

    @Override
    void openCar() {
        System.out.println("Open Car");
    }
}
