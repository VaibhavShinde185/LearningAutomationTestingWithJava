package ex_100824.encapsulationPloymorphism.ecapsulation;

public class ICICIBank {
    private String name;
    private long balance;

    public ICICIBank(String name, long balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name, boolean isAuth) {
        if(isAuth){
        this.name = name;
            System.out.println("You can set the name");
    } else {
            System.out.println("You can not set the name");
        }
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance, boolean isAdmin) {
        if(isAdmin) {
            this.balance = balance;
            System.out.println("You can update balance.");
        } else {
            System.out.println("You can not update balance");
        }
    }
}
