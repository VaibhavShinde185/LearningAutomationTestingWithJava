package practiceJava.string;

public class D {

    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = str1.concat(" World");

        System.out.println(str1);
        System.out.println(str2);

        System.out.println(str2.charAt(0));     //H
        System.out.println(str2.concat(" - Learning String Functions"));
        System.out.println(str2.contains("Hello"));     //true
        System.out.println("------------------------------------------------------------");

        String name = "Vaibhav";
        String name1 = new String("Vaibhav");

        System.out.println(name == name1);          //false -- Check for the Ref. object
        System.out.println(name.equals(name1));     //false -- Check for the Content equality
        System.out.println(name.equalsIgnoreCase(name1));           //true

        System.out.println(str2.indexOf("W"));          //6
        System.out.println(str1.length());

        System.out.println(str2.replaceAll("World","All"));
        System.out.println(str1.replace("H","Q"));

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());



    }

}
