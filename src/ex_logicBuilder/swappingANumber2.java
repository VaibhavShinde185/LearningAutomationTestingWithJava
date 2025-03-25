package ex_logicBuilder;

public class swappingANumber2 {

    public static void main(String[] args) {

        int num1 = 9;
        int num2 = 6;

        System.out.println("Before Swapping");
        System.out.printf("1st Number is: %d\n", num1);
        System.out.printf("2nd Number is: %d", num2);
        System.out.println();


        // 1st Logic
//        num1 = num1 + num2;
//        num2 = num1 - num2;
//        num1 = num1 - num2;
//
//        System.out.println("Before Swapping by using + and - operator");
//        System.out.printf("1st Number is: %d\n",num1);
//        System.out.printf("2nd Number is: %d\n",num2);

        // 2nd logic
        num1 = num1 * num2;
        num2 = num1 / num2;
        num1 = num1 / num2;

        System.out.println("After Swapping by using * and / operator");
        System.out.printf("1st Number is: %d\n",num1);
        System.out.printf("2nd Number is: %d\n",num2);

    }
}
