package ex_100824.encapsulationPloymorphism.ecapsulation;

public class eCapsulation1 {
    public static void main(String[] args) {
        VWOLogin vwoLogin = new VWOLogin("adimin", "password");
        System.out.println(vwoLogin.userName);
        vwoLogin.userName = "alex";
        System.out.println(vwoLogin.userName);

    }
}

class VWOLogin{
    public String userName;
    public String password;

    public VWOLogin(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
}

//userName and password is not secure  that's where encapsulation comes into picture  - refer above program
//all the data members should declare as a private and invoke by the get and set method
//Data members are controlled by get and set functions