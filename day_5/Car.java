package day_5;



// Single Level Inheritence
class Car extends Vehicle {

    int wheels;

    Car(String brand, int speed, int wheels) {
        super(brand, speed);
        this.wheels = wheels;
        System.out.println("Car constructor called");
    }

    void carInfo() {
        System.out.println("Wheels: " + wheels);
    }
}
