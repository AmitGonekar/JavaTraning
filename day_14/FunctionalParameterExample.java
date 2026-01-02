package day_14;

public class FunctionalParameterExample {

    public static void greetUser(Greeting greeting) {
        greeting.sayHello("Amit");
    }

    public static void main(String[] args) {

        greetUser(name -> System.out.println("Welcome " + name));
    }
}

