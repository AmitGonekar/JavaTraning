package day_11;

//join() -> Waits for another thread to finish

class JoinDemo extends Thread {

    public void run() {
        System.out.println("Child thread");
    }

    public static void main(String[] args) throws InterruptedException {
        JoinDemo t = new JoinDemo();
        t.start();
        t.join(); // main waits
        System.out.println("Main thread");
    }
}

