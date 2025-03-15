package ex_110824_abstractionInterface.Interface.multipleinheritance;

public class son implements mother, father{
    @Override
    public void home() {
        System.out.println("This is declared by father but completed by the son.");
    }

    @Override
    public void money() {
        System.out.println("This is only one function!");
    }
}
