package ex_140724;

public class storing_A_String {
    public static void main(String[] args) {
        String name = "VAIBHAV";
        String name2 = new String ("Vaibhav Shinde");
        // Both of them, actually save the name, name2 in different ways JVM
        // How they store the values in the JVM? -   SCP nad Heap - JVM
        // How many ways we can store a String - 2
        // = new operator  - heap
        // = "SCP" // String Constant Pool
        // new - Objects(heap)

        System.out.println(name);                               //VAIBHAV
        System.out.println(name.toLowerCase());                 //vaibhav
        System.out.println(name.length());                      //7
        System.out.println(name.toUpperCase());                 //VAIBHAV
        System.out.println(name.charAt(2));                     //I
        System.out.println(name.charAt(0));                     //V
     //   System.out.println(name.charAt(7)); // Exception Index 10 out of bounds
        System.out.println("\n");                               // new line

        String s1 = "Pramod";    // 1 , SCP
        s1 = "Amit";             // 2 , SCP
        s1 = "Dutta";            // 3 . SCP
        s1 = "Vaibhav";          // 4 . SCP
        System.out.println(s1);                                 //Vaibhav
        System.out.println("\n");                               //new line

        String A = new String("Vaibhav");
        String B = new String("Pramod");
        //  2, Heap area
        String C  = A; // (This doesn't mean this in the SCP) -: C -> A (heap area)
        //  2, heap  s3 -> s1 -> Pramod

        System.out.println(A);                  //Vaibhav
        System.out.println(B);                  //Pramod
        System.out.println(C);                  //Vaibhav
        System.out.println("\n");               //new line

        String str1="Hello ";
        String str2="Guys";
        String str3=str1.concat(str2);
        System.out.println(str3);
        System.out.println("\n");

        String fort = "Panhala";
        System.out.println(fort.concat(" to Vishalgad \n"));

        //both org and org1 point to the same object in the SCP.
        String org = "The Testing Academy"; // SCP
        String org1 = "The Testing Academy"; // SCP

        //new keyword explicitly creates a new String object in the heap memory, even if an identical string exists in the SCP.
        String org2 = new String("The Testing Academy"); // Heap area (OA)

//        System.out.println(org == org1); // Check for the Ref
//        System.out.println(org.equals(org1)); // Check for the Content
//        System.out.println(org == org2);

        System.out.println(org1 == org2); // Check for the Ref  - false, different objects
        System.out.println(org1.equals(org2)); // Check for the Content - true, same content
        System.out.println("\n");

//        The "==" operator checks if two references point to the same object (reference equality).
//        The "equals()" method checks if the content of two objects is the same (content equality).

        String password  = "VAIBHAV@123";
        String pass_u = password.toLowerCase();
        System.out.println(pass_u + "\n");
        // pass_u == password
        System.out.println(pass_u == password);
        System.out.println(pass_u.equals(password));
        System.out.println(pass_u.equalsIgnoreCase(password));
        //Vaibhav@123 =  vaibhav@123  = VAibhav@123 = VaiBhaV@123
        System.out.println("\n");

        System.out.println(password.substring(0,3));
        System.out.println(password.indexOf('V'));  //if char does not exist in "VAIBHAV@123", this will return -1
        System.out.println(password.length());
        System.out.println("\n");

        double sq = Math.sqrt(2);
        System.out.println(sq);
        int result = Math.max(10,23);
        System.out.println(result);
    }
}
