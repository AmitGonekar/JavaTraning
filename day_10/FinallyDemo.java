package day_10;


class FinallyBehaviorDemo {

    public static void main(String[] args) {

        try {
            // Try block executes first
            System.out.println("Inside try block");

            // Returning from try block
            return;
        }
        finally {
            // Finally executes even after return
            System.out.println("Inside finally block");
        }
    }
}


