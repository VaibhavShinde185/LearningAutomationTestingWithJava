package ex_240824;

import java.util.Stack;

public class lab237 {
    public static void main(String[] args) {
        // Vector, Stack - Legacy - 95% of time we are not going to use it in automation
        // legacy? - old ->

        Stack s = new Stack();
        s.push("Vaibhav");
        s.push("Shinde");
        s.push("VVVVVVVVV");
        s.add("Viraj");
        System.out.println(s);
        System.out.println(s.peek());       //It shows last added item
        System.out.println("------------------------");
        System.out.println(s.pop());        //removes last added item
        System.out.println("------------------------");
        System.out.println(s);

    }
}
