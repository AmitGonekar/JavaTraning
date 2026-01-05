package day_11;

//Creating Thread using Runnable Interface (Best Practice)
//Implement Runnable
//Override run()
//Pass object to Thread constructor

class MyRunnable implements Runnable {

    public void run() {
        System.out.println("Thread is running using Runnable interface");
    }

    public static void main(String[] args) {
        MyRunnable r = new MyRunnable(); // Runnable object
        Thread t = new Thread(r);        // Thread object
        t.start();
    }
}

