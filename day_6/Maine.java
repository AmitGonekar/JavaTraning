package day_6;

// Polymorphism
// Runtime Polymorphism
// Method Overloading
// Method Overriding
// Upcasting
// Downcasting


class Parent {

    // Method Overloading
    void show() {
        System.out.println("Parent show()");
    }

    void show(int x) {
        System.out.println("Overloaded show: " + x);
    }
}

class Child extends Parent {

    // Method Overriding (Runtime Polymorphism)
    @Override
    void show() {
        System.out.println("Child show()");
    }

    void childMethod() {
        System.out.println("Child specific method");
    }
}

public class Maine {
    public static void main(String[] args) {

        // Upcasting
        Parent p = new Child();

        // Runtime Polymorphism JVM decides which method call at runtime.
        p.show();          // Child show()

        // Overloading
        p.show(10);

        // Downcasting
        Child c = (Child) p;
        c.childMethod();
    }
}

