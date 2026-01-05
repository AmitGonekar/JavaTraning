package day_6;

// immutable classes(Advance Encapsulation)
//Immutable classes cannot be modified after creation.
//- Rules: class must be final, fields private & final, no setters.
//- Useful in concurrent environments to avoid race conditions.

final class BankAccount {
    private final String accountNumber;
    private final double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}

