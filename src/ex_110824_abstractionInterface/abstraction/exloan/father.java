package ex_110824_abstractionInterface.abstraction.exloan;

abstract class father {
    abstract void loan50K();
    void loan(){
        System.out.println("Already paid this loan");
    }
}
