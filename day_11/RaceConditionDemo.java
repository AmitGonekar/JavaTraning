package day_11;


// Program (Without Synchronization)

class Counter {
    int count = 0;

    void increment() {
        count++;
    }
}

class RaceConditionDemo {
    public static void main(String[] args) throws InterruptedException {

        Counter c = new Counter();

        Thread t1 = new Thread(() -> {
            for(int i=0;i<1000;i++) c.increment();
        });

        Thread t2 = new Thread(() -> {
            for(int i=0;i<1000;i++) c.increment();
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(c.count); // Wrong result
    }
}


/*  Synchronized Method
    Only one thread at a time
    Object-level lock

    class Counter {
        int count = 0;

        synchronized void increment() {
            count++;
        }
}
*/


/* Synchronized Block

void increment() {
    synchronized(this) {
        count++;
    }
}
*/