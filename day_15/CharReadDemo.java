package day_15;

import java.io.FileReader;

//Program: Read Text using FileReader

public class CharReadDemo {
    public static void main(String[] args) throws Exception {

        FileReader reader = new FileReader("charFile.txt");

        int ch;
        while ((ch = reader.read()) != -1) {
            System.out.print((char) ch);
        }

        reader.close();
    }
}

