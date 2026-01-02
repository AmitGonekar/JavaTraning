package day_14;

//What is Method Reference?
    //Shortcut for lambda when method already exists
    //Types
    //Static method reference → ClassName::method
    //Instance method reference → object::method
    //Constructor reference → ClassName::new

import java.util.*;

public class StaticMethodRefExample {

    public static void print(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring");

        list.forEach(StaticMethodRefExample::print);
    }
}

