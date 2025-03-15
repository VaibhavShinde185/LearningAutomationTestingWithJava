package ex_110824_abstractionInterface.Interface.ex1;

public class wagonR implements engine{

   void drive(){
       startEngine();
       stopEngine();
   }

    @Override
    public void startEngine() {
        System.out.println("Starting WagonR");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping WagonR");
    }
}
