package ex_130724;

public class concatination {
    public static void main(String[] args) {
        int a = 10;
        int b= 34;
        System.out.println(a+b);        // 44

        String s1 = "Vaibhav";
        String s2 = "Shinde";
        System.out.println(s1+ "\t" +s2);    // Vaibhav Shinde

        String s3 = "Amit";
        int x = 99;
        int y = 100;

        System.out.println(x+y+s3); // 199Amit
        System.out.println(s3+x+y); // Amit99100
        System.out.println(x+s3+y); // 99Amit100

        System.out.println(x+y+s3+y+s3+x+y);    // 199Amit100Amit99100

    }
}