package day_7;

public class Literalss {
    public static void main(String[] args) {

        //String Literal  ->  stored in String Pool
        String s1 = "Java";
        System.out.println(s1);

        //new String() ->  stored in heap (not in pool by default).
        String s2 = new String("Java");
        System.out.println(s2);

        System.out.println(s1 == s2) ; // - s1 == s2 → false (different memory locations).

        // equals() checks content
        System.out.println(s1.equals(s2)); // true
    }
}
