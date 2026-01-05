package day_11;

//Thread States
//NEW – Thread created but not started
//RUNNABLE – Ready to run / Running
//BLOCKED – Waiting for lock
//WAITING – Waiting indefinitely
//TIMED_WAITING – Waiting for fixed time
//TERMINATED – Execution finished

class LifeCycleDemo extends Thread {

    public void run() {
        System.out.println("Thread running");
    }

    public static void main(String[] args) {
        LifeCycleDemo t = new LifeCycleDemo(); // NEW
        t.start(); // RUNNABLE
    }
}

