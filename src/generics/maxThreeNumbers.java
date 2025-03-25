package generics;

public class maxThreeNumbers {

    public static void main(String[] args) {

        // Example without generic class and method

//        34, 54, 76
//        4.2, 3.4, 1.2
//        p, z, a
        int maxOutput = maximumNumber(34, 56, 76);
        System.out.println(maxOutput);

        double maxOutput1 = maximumNumber(3.6, 9.6, 6.6);
        System.out.println(maxOutput1);

        String maxOutput2 = maximumNumber("o", "a", "z");
        System.out.println(maxOutput2);
    }

    public static int maximumNumber(int a, int b, int c){
        int max = a;
        if(b > max){
            max = b;
        }
        if(c > max){
            max = c;
        }
     return max;
    }

    public static double maximumNumber(double a, double b, double c){
        double max = a;
        if(b > max){
            max = b;
        }
        if(c > max){
            max = c;
        }
        return max;
    }

    public static String maximumNumber(String x, String y, String z){
        String max = x;
        if(y.compareTo(max) > 0){
            max = y;
        }
        if(z.compareTo(max) > 0){
            max = z;
        }
        return max;
    }

}
