package day_15;

import java.io.FileInputStream;
import java.io.FileOutputStream;

// Program: Copy File using Byte Stream

public class FileCopyDemo {
    public static void main(String[] args) throws Exception {

        FileInputStream fis = new FileInputStream("byteFile.txt");
        FileOutputStream fos = new FileOutputStream("copy.txt");

        int data;
        while ((data = fis.read()) != -1) {
            fos.write(data);
        }

        fis.close();
        fos.close();
        System.out.println("File copied");
    }
}

