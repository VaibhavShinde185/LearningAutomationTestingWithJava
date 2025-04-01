package generics;

public class G1 {

    // Example with generic method

    public static <dt> void temp(dt a){
        System.out.println(a);
    }

    public static void main(String[] args) {
        temp(96);
        temp(45.09);
        temp("A");
    }
}
