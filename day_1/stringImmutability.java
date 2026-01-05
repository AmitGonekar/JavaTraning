package day_1;

public class stringImmutability {

    public static void main(String[] args) {

        String s1 = "Hello";

        System.out.println("Before concatenation:");
        System.out.println("s1 value: " + s1);
        System.out.println("s1 reference: " + System.identityHashCode(s1));

        s1 = s1.concat(" World");

        System.out.println("\nAfter concatenation:");
        System.out.println("s1 value: " + s1);
        System.out.println("s1 reference: " + System.identityHashCode(s1));
    }
}


