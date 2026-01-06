package day_16;

// -> Definition
//Singleton ensures only one object of a class is created and provides global access to it.

    class Singleton {

        // Step 1: create static instance
        private static Singleton instance;

        // Step 2: private constructor
        private Singleton() {
            System.out.println("Singleton object created");
        }

        // Step 3: public method to get instance
        public static Singleton getInstance() {
            if (instance == null) {
                instance = new Singleton();
            }
            return instance;
        }
    }

    public class SingletonTest {
        public static void main(String[] args) {

            Singleton s1 = Singleton.getInstance();
            Singleton s2 = Singleton.getInstance();

            System.out.println(s1 == s2); // true
        }
    }





//Where is Singleton used?
//Database connection
//Logger
//Configuration class
//Cache


//Basic Singleton Structure
//Rules:
    //Constructor → private
    //Static instance
    //Public getInstance() method


//Explanation:
//private constructor → no one can create object
//static instance → shared
//Same object returned every time
