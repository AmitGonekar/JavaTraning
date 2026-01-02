package day_14;

@FunctionalInterface
interface Greeting {
    void sayHello(String name);
}


public class FunctionalInterfaceExample {
    public static void main(String[] args) {

        Greeting greeting = (name) -> {
            System.out.println("Hello " + name);
        };

        greeting.sayHello("Manprit");
    }
}

