package ex_110824_abstractionInterface.staticKeyword;

public class mainEx2 {
    public static void main(String[] args) {

        System.out.println("Main Starts");

            // Accessing static variable directly via class
            System.out.println("Course Name: " + ex2.courseName);

            // Calling static method directly
            ex2.printCourseInfo();

            // Creating first object
            ex2 c1 = new ex2("Vaibhav");
            System.out.println("Student Name: " + c1.getName());

            // Creating second object
            ex2 c2 = new ex2("Amit");
            System.out.println("Student Name: " + c2.getName());

            // Calling static nested class
            ex2.Helper.showHelp();

    }
}
