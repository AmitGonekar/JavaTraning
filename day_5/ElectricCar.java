package day_5;

// Multilevel Inheritence
class ElectricCar extends Car {

    int batteryCapacity;

    ElectricCar(String brand, int speed, int wheels, int batteryCapacity) {
        super(brand, speed, wheels);
        this.batteryCapacity = batteryCapacity;
        System.out.println("ElectricCar constructor called");
    }

    void batteryInfo() {
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

