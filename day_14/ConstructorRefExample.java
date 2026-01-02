package day_14;

interface PersonFactory {
    Person create(String name);
}

class Person {
    Person(String name) {
        System.out.println("Person name: " + name);
    }
}

public class ConstructorRefExample {
    public static void main(String[] args) {

        PersonFactory factory = Person::new;
        factory.create("Amit");
    }
}

