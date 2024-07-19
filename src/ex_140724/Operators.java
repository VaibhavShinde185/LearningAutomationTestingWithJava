package ex_140724;

public class Operators {
    public static void main(String[] args) {
        double c=34;
        double d=10;
        double result=c%d;
        System.out.println(result);

        // ✅ Operators
        int age = 65; // 10000001 -> switch off/ on
        // = Assignment Operator - Assign the value literal to the ref of data type

        // Arithmetic Operator +,-,/,*,
        // Modulus Operator %
        int a = 10;
        int b = 23;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b); // Remainders

        // Unary Operator
        age = +65;  //unary plus
        int lambo = -1; //unary minus
        System.out.println(age);
        System.out.println(lambo+2);

        //Concatination
        String firstname = "VAIBHAV";
        String lastname = "SHINDE";
        System.out.println(firstname + " " + lastname);

        // Compound Assignment Operators: += , -=, /=, *= . %=, += ->
        a = 10;

        a+=10; // a = a+10
        a-=10; // a = a-10
        a/=10; // a = a/10
        a*=10; // a = a*10

        // Relational Operators -> boolean (true or false), >, < >=,<=, == , != ( ! = )
        a = 10;
        b = 20;
        int sum = a+b; // operand a, b , operator =, +


    }
}
