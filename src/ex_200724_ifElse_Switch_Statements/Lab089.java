package ex_200724_ifElse_Switch_Statements;

import org.w3c.dom.ls.LSOutput;

public class Lab089 {
    public static void main(String[] args) {
        int itemcode = 001;

        switch (itemcode){
            case 001 -> System.out.println("It is a laptop!");
            case 002 -> System.out.println("It is a desktop!");
            case 003, 004 -> System.out.println("It is a mobile phone!");
        }
    }
}
