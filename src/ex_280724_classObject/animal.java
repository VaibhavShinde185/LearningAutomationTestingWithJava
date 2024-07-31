package ex_280724_classObject;

public class animal {

    String name = "LOL";
    String color;

    void walk(){}
    void talk(){}

    public static void main(String[] args) {

        animal animalrRef  = null;
        animal animalrRef2  = new animal();
        animal animalrRef3  = new animal();
        animal animalrRef4  = animalrRef2;
        System.out.println(animalrRef3.name);

    }
}
