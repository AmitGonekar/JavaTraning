package day_15;


//Program: Write Data using FileOutputStream

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteWriteDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("byteFIle.txt");

        String data = "Hello Java Byte Stream ";

        // Convert Stream to Byte
        fos.write(data.getBytes());

        fos.close();
        System.out.println("Data written successfully");


    }
}


// What are Byte Streams?
//Work with raw binary data
//Handle 8-bit bytes
//Used for:
//images
//audio/video
//binary files
//Common Classes
    //FileInputStream
    //FileOutputStream
