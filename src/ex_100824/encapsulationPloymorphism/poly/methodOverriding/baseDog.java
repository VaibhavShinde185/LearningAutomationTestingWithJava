package ex_100824.encapsulationPloymorphism.poly.methodOverriding;

public class baseDog {
    public static void main(String[] args) {
        hound h = new hound();
        h.bark();
        h.bike();

        dog d = new dog();
        d.bark();

        dog dh = new hound();       //Dynamic dispatch
        dh.bark();         //Overridden function
      //  dh.bike         //only common methods can call
    }
}


// only common method can access