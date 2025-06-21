package ex_280724_classObject;

public class person2 {
    public static void main(String[] args) {
        // OOPs - Concept
        // Real life problem -> OOPs concepts
        // Creating - New planet
        //  AHuman
        //  Attributes / properties -> 2 hand, eye color, node, mouth, height, wieght, body color, hair color
        // Behaviour / methods -> walk(), eat(), talk(), read(), sleep(), hear().

        // Amit - AHuman
        // A ->  Amit
        // B ->
        //  Blueprint - Class - Person

        person p = new person();
        // Real thing class -> Object
        p.name = "Amit";
        p.rollno = 1;
        p.walk();
        p.talk();

        person p2 = new person();
        // Real thing class -> Object
        p2.name = "Pramod";
        p2.rollno = 2;
        p2.sleep();
        p2.read();
    }
}
