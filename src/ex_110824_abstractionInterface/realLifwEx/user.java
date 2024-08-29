package ex_110824_abstractionInterface.realLifwEx;

public class user {
    public static void main(String[] args) {
        chrome c = new chrome();
        c.openBrowser();
        String s = c.closeBrowser("abcd");
        System.out.println(s);
        c.takeScreenShot();
        System.out.println();

        fireFox f = new fireFox();
        f.openBrowser();
        f.closeBrowser("xxx");
        f.takeScreenShot();

    }
}
