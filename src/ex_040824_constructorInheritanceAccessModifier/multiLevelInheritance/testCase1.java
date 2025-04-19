package ex_040824_constructorInheritanceAccessModifier.multiLevelInheritance;

public class testCase1 extends baseTestCase {
    void testCase(){
        startBrowser();
        // here we will write the TC
        closeBrowser();
    }

    public static void main(String[] args) {
        testCase1 tc1 = new testCase1();
        tc1.testCase();
    }
}
