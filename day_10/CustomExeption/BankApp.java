package day_10.CustomExeption;


class BankApplication {

    // Method that may throw custom exception
    static void withdraw(int balance, int amount)
            throws InsufficientBalanceException {

        // Checking business condition
        if (amount > balance) {
            // Throwing custom exception
            throw new InsufficientBalanceException("Insufficient balance");
        }

        // Executes if withdrawal is valid
        System.out.println("Withdrawal successful");
    }

    public static void main(String[] args) {

        try {
            // Calling withdraw method
            withdraw(5000, 8000);
        }
        catch (InsufficientBalanceException e) {
            // Handling custom exception
            System.out.println(e.getMessage());
        }
    }
}


