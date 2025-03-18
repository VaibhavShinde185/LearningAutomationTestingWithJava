import javax.sound.midi.Soundbank;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.SQLOutput;
import java.util.*;

public class practice_Lab {
    public static void main(String[] args) {

     List<Integer> it = new ArrayList<>();

     it.add(6);
     it.add(9);
     it.add(3);
     it.add(963);

     Iterator<Integer> a = it.iterator();
     while(a.hasNext()){
         System.out.println(a.next());
     }

    }
}


