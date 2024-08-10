package ex_040824_constructorInheritanceAccessModifier.multiLevelInheritance;

public class baseTestCase extends grandBaseTestCase {
    void startBrowser(){
        System.out.println("Starting Browser!");
    }
    void closeBrowser(){
        System.out.println("Closing Browser!");
    }
}
