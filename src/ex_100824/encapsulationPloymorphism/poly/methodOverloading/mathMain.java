package ex_100824.encapsulationPloymorphism.poly.methodOverloading;

public class mathMain {
    public static void main(String[] args) {
        mathOperations mathOperations = new mathOperations();
        int result = mathOperations.add(4,5);
        System.out.println("The addition is "+ result);

        double result2 = mathOperations.add(2.3,3.7);
        System.out.println("The addition is "+ result2);

        String result3 = mathOperations.add("ALex", " Joshi");
        System.out.println("The addition is "+ result3);

    }
}
