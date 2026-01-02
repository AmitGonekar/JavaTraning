package day_14;

import java.util.*;

public class ForEachMapExample {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "Spring");

        map.forEach((key, value) ->
                System.out.println(key + " : " + value));
    }
}

