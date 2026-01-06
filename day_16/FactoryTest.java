package day_16;

interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class ShapeFactory {

    public static Shape getShape(String type) {
        if (type.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (type.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        }
        return null;
    }
}

public class FactoryTest {
    public static void main(String[] args) {

        Shape shape1 = ShapeFactory.getShape("circle");
        shape1.draw();

        Shape shape2 = ShapeFactory.getShape("rectangle");
        shape2.draw();
    }
}



// -> What is Factory Pattern?
//Factory Pattern creates objects without exposing creation logic to the client.


// -> Why Factory?
//Avoid new keyword everywhere
//Loose coupling
//Centralized object creation


// Real-Life Example
//Pizza shop:
//Customer says “Veg Pizza”
//Shop decides which object to create

//Loose Coupling Explained
    //Client depends on interface
    //Not on concrete classes
    //Easy to add new shapes

//Factory in Spring
    //ApplicationContext.getBean()
    //Spring internally uses Factory pattern