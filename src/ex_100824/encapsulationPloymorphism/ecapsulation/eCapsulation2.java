package ex_100824.encapsulationPloymorphism.ecapsulation;

public class eCapsulation2 {
    public static void main(String[] args) {
    VWOLogin1 vwoLogin = new VWOLogin1("John", "Password");

        vwoLogin.setPassword("24861533759", false);
        System.out.println(vwoLogin.getPassword());

        System.out.println(vwoLogin.getUserName());
        vwoLogin.setUserName("Vaibhav185");

        System.out.println(vwoLogin.getUserName());
    }
}

class VWOLogin1{
    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password, boolean isAuth) {
        if(isAuth){
        this.password = password;
            System.out.println("allowed to change the password");
    } else {
            System.out.println("not allowed to change the password");
        }
    }

    public VWOLogin1(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
}
