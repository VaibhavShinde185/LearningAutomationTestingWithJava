package ex_110824_abstractionInterface.staticKeyword;

public class ex2 {

    // 1. Static variable
    static String courseName = "Automation Bootcamp";

    // 2. Instance variable
    private String name;

    // 3. Static Block
    static {
        System.out.println("Static Block: Class is loading...");
    }

    // 4. Instance Initialization Block (IIB)
    {
        System.out.println("IIB Block: Before constructor logic...");
    }

    // 5. Constructor
    public ex2(String name) {
        this.name = name;
        System.out.println("Constructor: Course object created.");
    }

    // 6. Getter for name
    public String getName() {
        return name;
    }

    // 7. Static Method
    public static void printCourseInfo() {
        System.out.println("Static Method: Welcome to " + courseName);
    }

    // 8. Static Nested Class
    static class Helper {
        static void showHelp() {
            System.out.println("Static Nested Class: Contact support@atb.com");
        }
    }



}
