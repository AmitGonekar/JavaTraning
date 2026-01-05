package day_6;

// Topic include in this programm
// Encapsulation
// Abstraction
// Runtime Polymorphism
// Upcasting

// Abstract class represents a general Account
// It provides common structure and behavior for all account types
abstract class Account {

    // PRIVATE variable → Encapsulation (Data Hiding)
    // Balance cannot be accessed directly from outside
    private double balance;

    // Constructor used to initialize balance
    // Called when child object is created
    public Account(double balance) {
        this.balance = balance;
    }

    // Public method to modify balance safely
    // Validation logic can be added here
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Getter method to access balance
    // Controlled access → Encapsulation
    public double getBalance() {
        return balance;
    }

    // Abstract method
    // Forces child classes to provide their own implementation
    // Enables Runtime Polymorphism
    abstract void calculateInterest();
}

// SavingsAccount IS-A Account
// Inherits common behavior from Account
class SavingsAccount extends Account {

    // Constructor calls parent constructor using super()
    public SavingsAccount(double balance) {
        super(balance);
    }

    // Overriding parent abstract method
    // Runtime Polymorphism happens here
    @Override
    void calculateInterest() {
        System.out.println("Savings Account Interest Applied");
    }
}

// CurrentAccount IS-A Account
class CurrentAccount extends Account {

    // Constructor calling parent constructor
    public CurrentAccount(double balance) {
        super(balance);
    }

    // Overriding method with different behavior
    @Override
    void calculateInterest() {
        System.out.println("No interest for Current Account");
    }
}

// Main class to test the application
public class BankApp {

    public static void main(String[] args) {

        // UPCASTING
        // Parent reference holding child object
        // Object type decides method execution
        Account acc1 = new SavingsAccount(5000);
        Account acc2 = new CurrentAccount(8000);

        // Runtime Polymorphism
        // JVM decides which calculateInterest() to call at runtime
        acc1.calculateInterest(); // SavingsAccount method
        acc2.calculateInterest(); // CurrentAccount method

        // Accessing balance using getter (Encapsulation)
        System.out.println(acc1.getBalance());
        System.out.println(acc2.getBalance());
    }
}