package ex_040824_constructorInheritanceAccessModifier.hasA;

import ex_040824_constructorInheritanceAccessModifier.hasA.isA.tata;

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

        tata t = new tata();
        t.start();
    }



}
