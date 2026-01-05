package day_5;


public class InheritanceDemo {

    public static void main(String[] args) {

        System.out.println("----- SUV Object -----");
        SUV suv = new SUV("Tesla", 180, 4, 100);
        suv.start();
        suv.showSpeed();
        suv.carInfo();
        suv.batteryInfo();
        suv.suvFeature();

        System.out.println("\n----- Sedan Object -----");
        Sedan sedan = new Sedan("Tesla", 200, 4, 90);
        sedan.start();
        sedan.showSpeed();
        sedan.carInfo();
        sedan.batteryInfo();
        sedan.sedanFeature();
    }
}
