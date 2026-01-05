package day_7;

public class StringBuilderMethods {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");

        sb.append(" Programming");     // add text
        sb.insert(5, "Core ");         // insert text
        sb.delete(5, 10);              // delete part
        sb.reverse();                  // reverse string

        System.out.println(sb);
        System.out.println(sb.capacity());
    }
}

