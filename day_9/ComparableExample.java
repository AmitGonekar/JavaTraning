package day_9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student(3,"Amit"));
        list.add(new Student(1,"Tom"));
        list.add(new Student(2,"Jerry"));

        // Sorting using Comparable
        Collections.sort(list);

        // Printing sorted list
        for (Student s : list) {
            System.out.println(s.id + " " + s.name);
        }
    }
}
