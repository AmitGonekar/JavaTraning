package day_14;

import java.util.*;

public class StreamUppercaseExample {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("java", "spring", "aws");

        names.stream()
                .map(name -> name.toUpperCase())
                .forEach(System.out::println);
    }
}

