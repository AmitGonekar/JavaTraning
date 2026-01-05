package day_11;

public class BankAccount {

    private int balance = 10000;

    synchronized void withdraw(int amount){

                        /* Entering the Synchronized Method
                           withdraw() method is synchronized
                           Only one thread at a time can enter this method
                           JVM applies object-level lock on BankAccount
                        */

        if(balance >= amount){
            System.out.println(Thread.currentThread().getName()+ " Withdraw " + amount);
            balance -= amount;
            System.out.println("Remaining Balance" + balance);
        }else {
            System.out.println("Insufficient Balance");
        }
    }
}

class Customer extends Thread{
    BankAccount account;

    Customer( BankAccount account, String name){
        super(name);
        this.account= account;
    }

    public void run() {
        account.withdraw(5000);
    }
}

 class BankDemo{
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Customer c1 = new Customer(account , "User-1");
        Customer c2 = new Customer(account, "User-2");

        c1.start();
        c2.start();
    }
}

// Points to remember
// start() creates new thread, run() doesn’t
// Runnable is preferred over Thread
// Synchronization prevents race condition
// wait() releases lock, sleep() doesn’t
// notify() wakes one thread, notifyAll() wakes all