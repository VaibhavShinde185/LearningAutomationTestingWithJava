package ex_100824.encapsulationPloymorphism.ecapsulation;

public class bank {
    public static void main(String[] args) {
        ICICIBank icici = new ICICIBank("ceiceila", 100);
        System.out.println(icici.getBalance());
        System.out.println(icici.getName());

        icici.setName("OOOOOOOOOO", false);
        System.out.println(icici.getName());

        icici.setBalance(98649856, true);
        System.out.println(icici.getBalance());
    }
}
