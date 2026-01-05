package day_3;

public class Person {
    String name;
}

    // By Object creation only the result is inside method not from main method

class ByObjects{

    static void update(Person p){
        p.name = "Amit";
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Bob";

        update(person);
        System.out.println(person.name);
    }
}
