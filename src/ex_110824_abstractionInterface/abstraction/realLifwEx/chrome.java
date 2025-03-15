package ex_110824_abstractionInterface.abstraction.realLifwEx;

public class chrome extends baseClass {
    @Override
    String openBrowser() {
        System.out.println("Opening the Chrome browser \n");
        return "";
    }

    @Override
    String closeBrowser(String abcd) {
        System.out.println("Closing the Chrome browser ");
        return "Browser is closed";
    }

    @Override
    void takeScreenShot() {
        System.out.println("\n" + "Okay Taking Screenshot of the chrome browser ");
    }
}
