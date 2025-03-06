package ex_270724_arrays;

public class arrays_3 {
    public static void main(String[] args) {

        String weekdays[] = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        System.out.println("Length of the array is: " + weekdays.length);
        System.out.println(weekdays[6]);
        System.out.println("--------------------------------------------------");

        for(int i=0;i< weekdays.length; i++){
            System.out.println(weekdays[i]);
        }
    }
}
