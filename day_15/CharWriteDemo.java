package day_15;

import java.io.FileWriter;

//Program: Write Text using FileWriter

public class CharWriteDemo {
    public static void main(String[] args) throws Exception {

        FileWriter writer = new FileWriter("charFile.txt");
        writer.write("Hello Java Character Stream");
        writer.close();

        System.out.println("Text written");
    }
}

//-> What are Character Streams?
        //Work with text data
        //Handle 16-bit Unicode characters
        //Automatically manage encoding
//Common Classes
        //FileReader
        //FileWriter
    //👉 Always preferred for text files

