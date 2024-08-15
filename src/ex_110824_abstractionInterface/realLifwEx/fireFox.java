package ex_110824_abstractionInterface.realLifwEx;

public class fireFox extends baseClass{
    @Override
    String openBrowser() {
        System.out.println("Opening the Firefox browser");
        return "";
    }

    @Override
    String closeBrowser(String browser) {
        System.out.println("Closing the Firefox browser");
        return "";
    }

    @Override
    void takeScreenShot() {
        System.out.println("Okay! Taking screenshot of the firefox browser ");
    }
}
