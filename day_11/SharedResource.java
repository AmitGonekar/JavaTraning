package day_11;


// Inter-Thread Communication

class SharedResource {
    int data;
    boolean available = false;

    synchronized void produce(int value) throws InterruptedException {
        while (available)
            wait();

        data = value;
        available = true;
        System.out.println("Produced: " + data);
        notify();
    }

    synchronized void consume() throws InterruptedException {
        while (!available)
            wait();

        System.out.println("Consumed: " + data);
        available = false;
        notify();
    }
}

