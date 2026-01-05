package day_10.CustomExeption;


// Custom exception class extending Exception (checked exception)
class InsufficientBalanceException extends Exception {

    // Constructor passes message to parent Exception class
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
