package day_11;

//Creating Thread using Thread Class
//Extend Thread class
//Override run() method
//Call start() to begin execution

class MyThread extends Thread {

    // Code that runs in a separate thread
    public void run() {
        System.out.println("Thread is running using Thread class");
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread(); // Thread object created
        t1.start(); // Creates new thread and calls run()
    }
}

// Important
//Never call run() directly
//Always call start()

