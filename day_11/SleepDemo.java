package day_11;


// start() -> Starts a new thread
//Internally calls run()

// run() -> Contains thread logic
//Never call directly for multithreading

// sleep() -> Pauses execution for fixed time

// yield() -> Gives chance to other threads

class SleepDemo {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 1; i <= 3; i++) {
            System.out.println(i);
            Thread.sleep(1000); // 1 second pause
        }
    }
}

