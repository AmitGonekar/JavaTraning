package day_15;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {
    public static void main(String[] args) throws IOException {

        Student s = new Student("Amit" , "password123", 21);

        ObjectOutputStream oos =
                new ObjectOutputStream(new FileOutputStream("student.ser"));

        oos.writeObject(s);
        oos.close();

        System.out.println("Object serialized");

    }
}

    //Serialization (Theory)
//What is Serialization?
//Converting object → byte stream
//Used for:
//saving object state
//sending object over network
//Key Points
//Class must implement Serializable
//transient fields are not saved
