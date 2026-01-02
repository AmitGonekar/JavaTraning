package day_14;

import java.util.*;

public class StreamMaxExample {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 15, 25, 10);

        int max = numbers.stream()
                .max(Integer::compareTo)
                .get();

        System.out.println("Max number: " + max);
    }
}

