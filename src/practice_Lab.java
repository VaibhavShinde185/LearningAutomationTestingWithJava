import javax.sound.midi.Soundbank;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.SQLOutput;
import java.util.*;

public class practice_Lab {
    public static void main(String[] args) {

        student s1 = new student(1, "Vaibhav");
        student s2 = new student(2, "Vinit");
        student s3 = new student(3, "Amar");
        student s4 = new student(4, "Shivaansh");

        List a = new ArrayList();
        a.add(s1);
        a.add(s2);
        a.add(s3);
        a.add(s4);
        System.out.println(a);

        Collections.sort(a, new sortByName());
        System.out.println(a);

    }
}

class sortByName implements Comparator<student>{
    @Override
    public int compare(student o1, student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class student{
    private Integer id;
    private String name;

    public student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
