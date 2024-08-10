package ex_040824_constructorInheritanceAccessModifier.multiLevelInheritance;

public class testCase2 extends baseTestCase {
    void testCase(){
        startBrowser();     //baseTestCase
        getDataFromSQL();      //grandBaseTestCase
        System.out.println(gold);   //grandBaseTestCase
        // here we will write the TC
        closeBrowser();     //baseTestCase
    }

    public static void main(String[] args) {
        new testCase2().testCase();
    }
}
