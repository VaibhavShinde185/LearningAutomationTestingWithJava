package ex_040824_constructor.hasA;

public class car {
    // Aggregation - hasA relationship
    // hasA relation does  not use any inheritance concept
    void startTheCar(){
        new engine().start();
        new tyres().rolling();
    }
}
