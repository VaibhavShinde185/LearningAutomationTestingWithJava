package ex_110824_abstractionInterface.realLifwEx;

public class chrome extends baseClass {
    @Override
    String openBrowser() {
        System.out.println("Opening the Chrome browser \n");
        return "";
    }

    @Override
    String closeBrowser(String browser) {
        System.out.println("Closing the Chrome browser \n");
        return "Browser is closed";
    }

    @Override
    void takeScreenShot() {
        System.out.println("Okay Taking Screenshot of the chrome browser ");
    }
}
