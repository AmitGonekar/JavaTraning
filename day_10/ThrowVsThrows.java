package day_10;

class ThrowVsThrowsDemo {

    // Method declares exception using 'throws'
    static void checkAge(int age) throws Exception {

        // Business rule check
        if (age < 18) {
            // Manually throwing exception using 'throw'
            throw new Exception("Age is not valid for voting");
        }

        // Executes if no exception is thrown
        System.out.println("Eligible for voting");
    }

    public static void main(String[] args) {

        try {
            // Calling method that may throw exception
            checkAge(16);
        }
        catch (Exception e) {
            // Handling exception in caller method
            System.out.println(e.getMessage());
        }
    }
}


