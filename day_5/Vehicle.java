package day_5;

// Parent class
class Vehicle {

    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
        System.out.println("Vehicle constructor called");
    }

    void start() {
        System.out.println(brand + " vehicle is starting");
    }

    void showSpeed() {
        System.out.println("Speed: " + speed + " km/h");
    }
}
