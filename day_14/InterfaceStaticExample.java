package day_14;

//Default & Static Methods in Interfaces
//Why Introduced?
//Backward compatibility
//Add new methods without breaking old code

//Interface with Default Method
interface Vehicle {
    default void start() {
        System.out.println("Vehicle is starting");
    }
}


//Override Default Method
class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car is starting");
    }
}

//Static Interface Method
interface Utility {
    static void showInfo() {
        System.out.println("Utility method");
    }
}

public class InterfaceStaticExample {
    public static void main(String[] args) {
        Utility.showInfo();
    }
}

