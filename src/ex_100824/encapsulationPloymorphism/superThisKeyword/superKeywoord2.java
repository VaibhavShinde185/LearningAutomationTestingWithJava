package ex_100824.encapsulationPloymorphism.superThisKeyword;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;

public class superKeywoord2 {

}

class student extends person{
    void message(){
        System.out.println("I am student!");
    }
    void display(){
        super.message();
    }
}

class person{
    void message(){
        System.out.println("I am person!");
    }
}