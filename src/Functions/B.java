package Functions;

public class B {
    // Write a function that takes two numbers as parameters and prints their difference.   -- With Parameters, No Return Type --
    public static void main(String[] args) {
        printDifference(18,9);

    }

    static void printDifference(int a, int b){
        int difference = a-b;
        System.out.println("The difference is " + difference);
    }

}
