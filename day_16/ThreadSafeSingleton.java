package day_16;

class ThreadSafeSingleton {

    private static volatile ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {}

    public static ThreadSafeSingleton getInstance() {
        if (instance == null) { // first check
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) { // second check
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}


//Drawbacks of Singleton
// Difficult to test
// Breaks Single Responsibility
// Global state problem
// Issues with multithreading (if not handled)
