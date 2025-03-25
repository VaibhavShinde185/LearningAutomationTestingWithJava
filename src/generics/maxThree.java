package generics;

public class maxThree {

    // Example with generic class and method


    public static <dt extends Comparable<dt>> dt maximumOf(dt a, dt b, dt c){
        dt max = a;
        if(b.compareTo(max) > 0){
            max = b;
        }
        if(c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {

        System.out.println(maximumOf(34, 54, 76));
        System.out.println(maximumOf(4.9, 5.4, 7.6));

    }
}