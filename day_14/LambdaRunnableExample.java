package day_14;

public class LambdaRunnableExample {
    public static void main(String[] args) {

        // Lambda replaces Runnable implementation
        Runnable task = () -> {
            System.out.println("Thread is running using Lambda");
        };

        Thread thread = new Thread(task);
        thread.start();
    }
}

//Explanation
//Runnable has only run() → functional interface
//Lambda directly provides run() logic

