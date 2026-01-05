package day_10;

class ExceptionPropagationDemo {

    // Method where exception occurs
    static void method1() {
        // ArithmeticException occurs here
        int result = 10 / 0;
    }

    // Method that calls method1
    static void method2() {
        method1(); // exception propagates to this method
    }

    public static void main(String[] args) {

        try {
            // Exception propagates up to main method
            method2();
        }
        catch (ArithmeticException e) {
            // Exception finally handled here
            System.out.println("Exception handled in main method");
        }
    }
}


