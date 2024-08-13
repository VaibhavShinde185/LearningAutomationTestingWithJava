package ex_100824.encapsulationPloymorphism.superThisKeyword;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;

public class superKeywoord2 {
    public static void main(String[] args) {
        student s = new student();
        s.display();
    }
}

class student extends person{
    void message(){
        System.out.println("I am student!");
    }
    void display(){
        //super.message();
        this.message();
    }
}

class person{
    void message(){
        System.out.println("I am person!");
    }
}