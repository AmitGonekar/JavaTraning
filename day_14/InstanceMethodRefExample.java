package day_14;

public class InstanceMethodRefExample {

    public void display(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {

        InstanceMethodRefExample obj = new InstanceMethodRefExample();
        Greeting greeting = obj::display;

        greeting.sayHello("Hello Java 8");
    }
}

