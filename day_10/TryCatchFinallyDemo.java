package day_10;


class TryCatchFinallyDemo {

    public static void main(String[] args) {

        try {
            // Risky code: dividing by zero causes ArithmeticException
            int result = 10 / 0;
        }
        catch (ArithmeticException e) {
            // This block executes when ArithmeticException occurs
            System.out.println("Cannot divide by zero");
        }
        finally {
            // Finally block always executes (used for cleanup)
            System.out.println("Finally block executed");
        }
    }
}


