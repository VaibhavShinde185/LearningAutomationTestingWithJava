package ex_110824_abstractionInterface.Interface.ex3;

public interface E {

    void startEngine();

    void stopEngine();

    default void haltingEngineJustStart() {
        System.out.println("Halt the Engine");
    }

    default void haltingEngineJustStop() {
        System.out.println("Halt the Engine");
    }

    static void M1() {
        System.out.println("M1");
    }

    void m2();
    void m3();

    
//   void m4(){
//       System.out.println("Not possible - interface abstract method should not have concrete methods." +
//               " It is only allowed with the default keyword.");
//   }

}
