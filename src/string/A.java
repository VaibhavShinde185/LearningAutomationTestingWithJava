package string;

public class A {
    public static void main(String[] args) {
        String name = "VAIBHAV";
        String name2 = new String ("Vaibhav Shinde");
        // name will store in SCP i.e. String Constant Pool
        // name2 will store in Heap area

        System.out.println(name);                               //VAIBHAV
        System.out.println(name.toLowerCase());                 //vaibhav
        System.out.println(name.length());                      //7
        System.out.println(name.toUpperCase());                 //VAIBHAV
        System.out.println(name.charAt(2));                     //I
        System.out.println(name.charAt(0));                     //V
        System.out.println(name.indexOf('B'));                  //3
        //   System.out.println(name.charAt(7)); // Exception Index 10 out of bounds
//        System.out.println("\n");                               // new line
        System.out.println("-----------------------------------------------------");

        String A = new String("Vaibhav");
        String B = new String("Pramod");
        //  2, Heap area
        String C  = A; // (This doesn't mean this in the SCP) -: C -> A (heap area)

        System.out.println(A);                  //Vaibhav
        System.out.println(B);                  //Pramod
        System.out.println(C);                  //Vaibhav
        System.out.println("-----------------------------------------------------");

        String str1="Hello ";
        String str2="Guys";
        String str3=str1.concat(str2);
        System.out.println(str3);

        String fort = "Panhala";
        System.out.println(fort.concat(" to Vishalgad \n"));
        System.out.println("-----------------------------------------------------");

        //both org and org1 point to the same object in the SCP.
        String org = "The Testing Academy"; // SCP
        String org1 = "The Testing Academy"; // SCP

        //new keyword explicitly creates a new String object in the heap memory, even if an identical string exists in the SCP.
        String org2 = new String("The Testing Academy"); // Heap area

        System.out.println(org == org1);      // Check for the Ref -- true
        System.out.println(org.equals(org1)); // Check for the Content  -- true
        System.out.println(org == org2);      // false
        System.out.println(org1 == org2);     // false, different objects
        System.out.println(org1.equals(org2)); // Check for the Content - true, same content

//        The "==" operator checks if two references point to the same object (reference equality).
//        The "equals()" method checks if the content of two objects is the same (content equality).

        System.out.println("--------------------------------------------------------");

        String password  = "VAIBHAV@123";
        String pass_u = password.toLowerCase();
        System.out.println(pass_u);
        System.out.println(pass_u == password);     //false
        System.out.println(pass_u.equals(password));
        System.out.println(pass_u.equalsIgnoreCase(password));
        System.out.println(password.substring(0,3));


    }
}
