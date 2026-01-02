package day_14;

//forEach Method
//What is forEach?
    //Default method in Iterable
    //Functional way to loop

import java.util.*;

public class ForEachListExample {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Java", "Spring", "AWS");

        list.forEach(item -> System.out.println(item));
    }
}

