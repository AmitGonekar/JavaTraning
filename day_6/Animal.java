package day_6;


class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Main{
    public static void main(String[] args) {
        Animal a = new Dog(); // Upcasting
        // Runtime polymorphism JVM decides method call at runtime.
        a.sound();   // Dog barks

    }
}

