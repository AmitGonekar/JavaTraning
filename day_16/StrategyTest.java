package day_16;


// Strategy Interface

interface PaymentStrategy {
    void pay(int amount);
}


// Implementations

class CreditCardPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}

class UpiPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

// Context

class PaymentContext {

    private PaymentStrategy strategy;

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void payAmount(int amount) {
        strategy.pay(amount);
    }
}


// : Client

public class StrategyTest {
    public static void main(String[] args) {

        PaymentContext context = new PaymentContext();

        context.setStrategy(new CreditCardPayment());
        context.payAmount(1000);

        context.setStrategy(new UpiPayment());
        context.payAmount(500);
    }
}

