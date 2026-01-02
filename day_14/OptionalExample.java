package day_14;

// Why Optional?
    //Avoids NullPointerException
    //Makes null handling explicit

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {

        Optional<String> name = Optional.of("Java");

        System.out.println(name.get());
    }
}



