package ex_200724_ifElse_Switch_Statements;

import java.util.Scanner;

public class Lab087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a browser name, where you want to execute the program");
        String browserName = sc.next();
        browserName = browserName.toLowerCase();

        switch (browserName){
            case "chrome":
                System.out.println("Starting the Chrome browser");
                break;
            case "firefox":
                System.out.println("Starting firefox");
                break;
            case "edge":
                System.out.println("Starting Edge");
                break;
            default:
                System.out.println("I have no idea which browser is this");
                break;
        }
    }
}
