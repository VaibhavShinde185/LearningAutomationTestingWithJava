package allInOne;

public class lab005 {
    public static void main(String[] args) {
        /** Write a program that prints numbers from 1 to 100. However, for multiples of 3, print "Fizz" instead of the number,
         and for multiples of 5, print "Buzz." For numbers that are multiples of both 3 and 5, print "FizzBuzz."    */

        
        for (int i = 1; i < 101; i++) {

            if (i%3==0 && i%5==0 ){
                System.out.println("This number is divisible by 3 and 5. So, " + " Fizz - Buzz ");
            } else if (i%3==0) {
                System.out.println(" Fizz ");
            } else if (i%5==0){
                System.out.println(" Buzz ");
            } else
            System.out.println(i);
        }


    }
}
