package day_15;

import java.io.FileInputStream;

//Program: Read Data using FileInputStream

public class ByteReadDemo {
    public static void main(String[] args) throws Exception {

        FileInputStream fis = new FileInputStream("byteFile.txt");

        int ch;
        while ((ch = fis.read()) != -1) {
            System.out.print((char) ch);
        }

        fis.close();
    }
}

