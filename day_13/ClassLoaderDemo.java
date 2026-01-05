package day_13;

public class ClassLoaderDemo {
    public static void main(String[] args) {

        // Application ClassLoader
        System.out.println("ClassLoader of this class: "
                + ClassLoaderDemo.class.getClassLoader());

        // Bootstrap ClassLoader (returns null)
        System.out.println("ClassLoader of String class: "
                + String.class.getClassLoader());
    }
}

