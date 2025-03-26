package ex_240824;

import java.util.Enumeration;
import java.util.Hashtable;

public class lab246 {
    public static void main(String[] args) {
        {

            Hashtable<Integer, String> http = new Hashtable<>();
            // Map
            // Hashtable does not allow null
            // Synchronised
            // Slow
            // Legacy Class

            http.put(1, "one");
            http.put(2, "two");
            http.put(3, "three");


            //
            Enumeration<Integer> e = http.keys();
            while (e.hasMoreElements()) {
                System.out.println(http.get(e.nextElement()));
            }
        }
    }

    }