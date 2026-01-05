package day_9;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "Java"); // values can duplicate

        for (Integer key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}

