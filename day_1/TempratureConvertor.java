package day_1;

public class TempratureConvertor {

        static double celsiusToFahrnheit(double c) {
            return (c * 9 / 5) + 32; // this is a formula to convert Celsius to Fahrnheit
        }

        public static void main(String[] args) {
            System.out.println(celsiusToFahrnheit(25));
        }



}
