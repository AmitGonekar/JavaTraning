package day_10;


import java.io.FileReader;
import java.io.IOException;

class TryWithResourcesDemo {

    public static void main(String[] args) {

        // Resource declared inside try (AutoCloseable)
        try (FileReader fr = new FileReader("data.txt")) {

            // File opened successfully
            System.out.println("File opened");

        }
        catch (IOException e) {
            // Handles file-related exceptions
            System.out.println(e.getMessage());
        }

        // Resource is automatically closed by JVM
    }
}


