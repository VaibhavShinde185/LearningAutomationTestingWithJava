package practiceJava;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;
public class practice_Lab3 {
    public static void main(String[] args) {

    VWOLogin vwo = new VWOLogin("Jai", "123");

        System.out.println(vwo.getUserName());
        System.out.println(vwo.getPassword());

        vwo.setUserName("Shetty");
        System.out.println(vwo.getUserName());

        vwo.setPassword("963", true);
        System.out.println(vwo.getPassword());

    }
}

class VWOLogin{
    String userName;
    String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean isAuth) {
        if(isAuth){
        this.password = password;
            System.out.println("Allowed to change the password");
    } else {
            System.out.println("not allowed to change the password");
        }
    }

    public VWOLogin(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
}

