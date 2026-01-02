package day_14;


// -> lambda expression is an anonymous function (function without name).

// AddOperation has one abstract method → functional interface
@FunctionalInterface
interface AddOperation{
    int add(int a, int b);
}

public class LambdaAdd {
    public static void main(String[] args) {

        // Lambda expression implementation
        AddOperation operation  = (a,b) -> a + b;

        // Calling the method
        int result = operation.add(10,20);

        System.out.println("Sum is "+ result);

    }
}


    // ->  Why didn't create object
    // Because lambda expressions do NOT create objects like classes do.
    //  They provide an implementation of a functional interface, not an object of a class.

    // -> What happens with Lambda (Java 8)
    //No class name
    // No new keyword
    // Because lambda is NOT a class
    // It is just the implementation of the single abstract method
    //AddOperation is a functional interface
    //Lambda provides the method body of add(int a, int b)
    //JVM internally creates a lightweight function object
    //This object is not created explicitly by us

