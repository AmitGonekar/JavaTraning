package day_1;

class Person {
    int age;

    Person(int age) {
        this.age = age;
    }
}

public class StackHeapDemo {

    public static void main(String[] args) {

        // Stack variables (references)
        Person p1 = new Person(20);
        Person p2 = new Person(30);

        // Another reference pointing to same object
        Person p3 = p1;

        System.out.println("p1 age: " + p1.age);
        System.out.println("p2 age: " + p2.age);
        System.out.println("p3 age: " + p3.age);

        // Printing reference identity (simulated)
        System.out.println("\nReference identities:");
        System.out.println("p1 -> " + System.identityHashCode(p1));
        System.out.println("p2 -> " + System.identityHashCode(p2));
        System.out.println("p3 -> " + System.identityHashCode(p3));

        // Modify object via p3
        p3.age = 99;

        System.out.println("\nAfter modifying p3:");
        System.out.println("p1 age: " + p1.age);
        System.out.println("p3 age: " + p3.age);
    }
}

