package ex_110824_abstractionInterface.excar;

public class i20 extends engine {
    void drivei20() {
        openCar();
        start();
        partGearBox();
        stop();
        speed();
    }

    @Override
    void start() {
        System.out.println("IIIIIIIIIIIIIIII");
    }

    @Override
    void stop() {

    }

    @Override
    void speed() {

    }

    @Override
    void partGearBox() {

    }

    @Override
    void openCar() {

    }
}
