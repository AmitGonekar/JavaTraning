package day_9;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        // Creating ArrayList of String type
        ArrayList<String> names = new ArrayList<>();

        // Adding elements
        names.add("Java");
        names.add("Python");
        names.add("Java"); // duplicate allowed
        names.add("C++");

        // Accessing elements using index
        System.out.println("First element: " + names.get(0));

        // Iterating using for-each loop
        System.out.println("All elements:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}

