package ex_040824_constructorInheritanceAccessModifier.hasA;

public class car {
    // Aggregation - hasA relationship
    // hasA relation does  not use any inheritance concept
    protected void startTheCar(){
        new engine().start();
        new tyres().rolling();
    }

    public static void main(String[] args) {
        car c = new car();
        c.startTheCar();
    }
}
