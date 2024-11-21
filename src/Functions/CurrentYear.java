package Functions;

import java.time.LocalDate;
import java.time.Year;

public class CurrentYear {
    // Create a function that prints the current year. --- No Parameters, No Return Type ---
    public static void main(String[] args) {
        printCurrentYear();
        printCurrentDate();
    }

    static void printCurrentYear(){
        int year = Year.now().getValue();
        System.out.println("Current year is :" + year );
    }

    static void printCurrentDate(){
        LocalDate currentDate = LocalDate.now();
        System.out.println("Today's date is: " + currentDate);
    }

}
