package Functions;

public class F {
    // With Parameters and With Return Type
    // Create a function that takes the length and width of a rectangle and returns its area.

    public static void main(String[] args) {
        System.out.println("Area of the given rectangle is " + area(9,6));
    }

    static int area(int l, int w){
        int areaOfRectangle = l*w;
        return areaOfRectangle;
    }

}
