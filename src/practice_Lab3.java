import java.util.Scanner;

public class practice_Lab3 {
    public static void main(String[] args) {

        practice_Lab2 abc = new practice_Lab2();
        abc.printDetails();
        System.out.println("--------------------------------------------------------------------------");

        practice_Lab2 pqr = new practice_Lab2("ICICI", "icicn003", 3333);
        pqr.printDetails();
        System.out.println("---------------------------------------------------------------------------");

        System.out.println("Taking user input and printing their bank name, IFSC code and bank balance!");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter bank name: ");
        String bankName = sc.next();

        System.out.print("Enter IFSC code: ");
        String ifscCode = sc.next();

        System.out.print("Enter bank balance: ");
        int bankBalance = sc.nextInt();

        practice_Lab2 userInput = new practice_Lab2(bankName, ifscCode, bankBalance);
        userInput.printDetails();

    }
}
