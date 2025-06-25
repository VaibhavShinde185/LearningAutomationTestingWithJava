package ex_110824_abstractionInterface.abstraction.excar;

public class nano extends engine{
    void drive(){
        openCar();
        start();
        partGearBox();
        speed();
        stop();
    }

    @Override
    void start() {
        System.out.println("Starting the tata nano");
    }

    @Override
    void stop() {
        System.out.println("Stopping the tata nano");
    }

    @Override
    void speed() {
        System.out.println("Speed of tata nano is 90");
    }

    @Override
    void partGearBox() {
        System.out.println("Gear box of tata nano");
    }

    @Override
    void openCar() {
        System.out.println("Opening a doors of tata nano!");
    }
}
