package day_10;

class StackTraceDemo {

    public static void main(String[] args) {

        try {
            // Creating an exception
            int a = 10 / 0;
        }
        catch (ArithmeticException e) {
            // Prints complete method call stack
            e.printStackTrace();
        }
    }
}
