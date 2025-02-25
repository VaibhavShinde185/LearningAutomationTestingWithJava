package practiceJava;

public class practice_Lab3 {
    public static void main(String[] args) {

        int course = 100;
        float GST = 18.45f;

//        int totalPrice = course + GST;
//            float totalPrice = course + GST;

        int totalPrice = course + (int)GST;

        System.out.println(totalPrice);

    }
}
