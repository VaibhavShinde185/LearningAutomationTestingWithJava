package ex_110824_abstractionInterface.realLifwEx;

public class edge extends baseClass {

    @Override
    String closeBrowser(String browser) {
        System.out.println("closing the edge browser");
        return "";
    }

    @Override
    String openBrowser() {
        System.out.println("opening the edge browser");
        return "";
    }

    @Override
    void takeScreenShot() {
        System.out.println("Okay! Taking screenshot of the edge browser ");
    }
}
