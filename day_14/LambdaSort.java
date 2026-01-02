package day_14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaSort {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Jery");
        names.add("Tom");
        names.add("Jack");

        // Sorting using lambda
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));

        System.out.println("Sorted List:");
        names.forEach(name -> System.out.println(name));
    }
}

    //Explanation
    //(s1, s2) → parameters of compare()
    //compareTo() decides sorting order
    //No need for Comparator class
