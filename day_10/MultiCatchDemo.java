package day_10;

class MultiCatchDemo {

    public static void main(String[] args) {

        try {
            // Creating a null reference
            String str = null;

            // This line throws NullPointerException
            System.out.println(str.length());
        }
        catch (NullPointerException | ArithmeticException e) {
            // Handles multiple exception types in a single catch block
            System.out.println("Exception handled safely");
        }
    }
}

