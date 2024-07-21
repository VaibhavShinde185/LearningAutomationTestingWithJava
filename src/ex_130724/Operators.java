package ex_130724;

public class Operators {
    public static void main(String[] args) {
        double c=34;
        double d=10;
        double result=c%d;
        System.out.println(result);

        //Operators
        int age = 65; // 10000001 -> switch off/ on
        // = Assignment Operator - Assign the value literal to the ref of data type

        //Arithmetic Operator +,-,/,*,%

        int a = 10;
        int b = 23;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b); // Remainders

        //Unary Operator
        age = +65;  //unary plus
        int lambo = -1; //unary minus
        System.out.println(age);
        System.out.println(lambo+2);

        //Concatination
        String firstname = "VAIBHAV";
        String lastname = "SHINDE";
        System.out.println(firstname + " " + lastname);

        //Compound Assignment Operators: += , -=, /=, *= . %=, += ->
        a = 10;

        a+=10; // a = a+10   = 20
        a-=10; // a = a-10   = 10
        a/=10; // a = a/10   = 1
        a*=10; // a = a*10   = 10

        //Relational Operators -> boolean (true or false), >, < >=,<=, == , != ( ! = )
        a = 10;
        b = 20;
        int sum = a+b; // operand a, b , operator =, +

        //Increment ++ and Decrement -- Operator : Pre, Post

        // pre - increment ++operand - value is incremented first and then stored in the result.
        int x = 10;
        int y = ++x; // x = x+1;
        // Exp = 11 , a = 11
        System.out.println(x);
        System.out.println(y);

        // POST - value is stored in the result and incremented later
        int m = 10;
        int result_m = m++;
        System.out.println(m);
        System.out.println(result_m);
        System.out.println("\n");

        //Logical Operator - and, or

        //Boolean operator - true, false

        //Ternary Operator
        //  ? if true do this : ele do that
        int newage = 14;
        String eligibility;

        // Using the ternary operator to determine voting eligibility
        eligibility = (newage >= 18) ? "Eligible to vote" : "Not eligible to vote";

        System.out.println("Person is " + eligibility);

        // new operator - OOPs concept
        // instanceOf operator - OOPs concept
        // Bitwise operator - not important for automation testing



        // data_type variable_name(identifier) = variable _value(literals)
        // Unary = Only 1 operand, operator
        //  age - operand, value - unary plus, = operator
        //  lambo - operand, value - unary minus, = operator


    }
}
