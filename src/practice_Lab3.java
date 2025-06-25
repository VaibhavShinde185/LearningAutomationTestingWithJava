import java.util.Scanner;

public class practice_Lab3 {
    public static void main(String[] args) {

        System.out.println("Main Starts");

        // Accessing static variable directly via class
        System.out.println("Course Name: " + practice_Lab2.courseName);

        // Calling static method directly
        practice_Lab2.printCourseInfo();

        // Creating first object
        practice_Lab2 c1 = new practice_Lab2("Vaibhav");
        System.out.println("Student Name: " + c1.getName());

        // Creating second object
        practice_Lab2 c2 = new practice_Lab2("Amit");
        System.out.println("Student Name: " + c2.getName());

        // Calling static nested class
        practice_Lab2.Helper.showHelp();

    }
}
