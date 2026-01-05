package day_15;

import java.io.File;
import java.io.IOException;

public class FileClassDemo {
    public static void main(String[] args) throws IOException {

        // Create File object (path only)
        File file = new File("example.txt");

        if(file.createNewFile()){
            System.out.println("FIle created");
        }else {
            System.out.println("File already existed");
        }


        // File information
        System.out.println("Name: " + file.getName());
        System.out.println("Path: " + file.getAbsolutePath());
        System.out.println("Size: " + file.length() + " bytes");
        System.out.println("Readable: " + file.canRead());
        System.out.println("Writable: " + file.canWrite());

        // Create directory
        File dir = new File("MyFolder");
        if (dir.mkdir()) {
            System.out.println("Directory created");
        }
    }
}
