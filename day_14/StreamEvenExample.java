package day_14;

//What is Stream?
    //A stream is a sequence of elements from a collection that:
    //Does not modify original data
    //Supports functional operations
    //Works in pipeline
//Stream Operations
    //Intermediate → filter(), map(), sorted()
    //Terminal → forEach(), collect(), reduce()

import java.util.*;

public class StreamEvenExample {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);

        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.println(n));
    }
}

