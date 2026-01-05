package day_9;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.addFirst(5);   // insertion at beginning
        numbers.addLast(30);   // insertion at end

        for (int num : numbers) {
            System.out.println(num);
        }
    }
}

