package ex_logicBuilder;

public class swappingANumber1 {
    public static void main(String[] args) {
        int num1 = 9;
        int num2 = 6;
        int temp;

        System.out.println("Before Swapping");
        System.out.printf("1st Number is: %d\n", num1);
        System.out.printf("2nd Number is: %d", num2);
        System.out.println();

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After Swapping");
        System.out.printf("1st Number is: %d\n", num1);
        System.out.printf("2nd Number is: %d", num2);

    }
}
