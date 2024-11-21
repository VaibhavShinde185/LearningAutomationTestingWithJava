package Functions;

public class C {
    // Create a function that accepts a person's name and age, then prints a welcome message like:
    //"Welcome [Name], you are [Age] years old!"  -- With Parameters, No Return Type --

    public static void main(String[] args) {

        printNameAge("Vaibhav", 30);
    }

    static void printNameAge(String name, int age){
        System.out.println("Your name is " + name);
        System.out.println("Your age is " + age);
        System.out.println("Welcome " + name + " you are " + age + " years old!");

    }

}
