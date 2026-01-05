package day_5;


// Hierarchical Inheritance    -> One Parent(ElectricCar) Multiple children(SUV, Sedan)
class SUV extends ElectricCar {

    SUV(String brand, int speed, int wheels, int batteryCapacity) {
        super(brand, speed, wheels, batteryCapacity);
        System.out.println("SUV constructor called");
    }

    void suvFeature() {
        System.out.println("SUV Feature: Off-road capability");
    }
}


class Sedan extends ElectricCar {

    Sedan(String brand, int speed, int wheels, int batteryCapacity) {
        super(brand, speed, wheels, batteryCapacity);
        System.out.println("Sedan constructor called");
    }

    void sedanFeature() {
        System.out.println("Sedan Feature: Luxury comfort");
    }
}

