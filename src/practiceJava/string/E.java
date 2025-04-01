package practiceJava.string;

public class E {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("hello");
        StringBuilder sb2 = new StringBuilder("hello");

        System.out.println(sb1 == sb2);
        System.out.println(sb1.equals(sb2));        // false    - equals() method from the Object class checks if sb1 and sb2 are the exact same object in memory
        System.out.println(sb1.toString().equals(sb2.toString()));

        System.out.println(sb1.append(" World"));
        System.out.println(sb1.replace(0,1,"H"));

        System.out.println(sb1.insert(11, " GM"));

        StringBuilder sb3 = new StringBuilder("Hello World GM");
        System.out.println(sb3.deleteCharAt(12));
        System.out.println(sb3.delete(12,13));

        System.out.println(sb3.replace(12,13, "New String!"));

        System.out.println(sb1.reverse());

        System.out.println(sb3.substring(12));




    }
}
