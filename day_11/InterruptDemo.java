package day_11;

// interrupt() -> Stops sleeping/waiting thread

class InterruptDemo extends Thread {

    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }

    public static void main(String[] args) {
        InterruptDemo t = new InterruptDemo();
        t.start();
        t.interrupt();
    }
}

