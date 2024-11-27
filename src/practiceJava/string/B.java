package practiceJava.string;

public class B {
    // Strings are immutable in nature.
    public static void main(String[] args) {
        String s1 = "Pramod";    // 1 , SCP
        s1 = "Amit";             // 2 , SCP
        s1 = "Dutta";            // 3 . SCP
        s1 = "Vaibhav";          // 4 . SCP
        System.out.println(s1);                                 //Vaibhav
        System.out.println("--------------------------------------------------------");

        //both org and org1 point to the same object in the SCP.
        String org = "The Testing Academy"; // SCP
        String org1 = "The Testing Academy"; // SCP

        //new keyword explicitly creates a new String object in the heap memory, even if an identical practiceJava.string exists in the SCP.
        String org2 = new String("The Testing Academy"); // Heap area (OA)
        System.out.println("--------------------------------------------------------");



    }
}
