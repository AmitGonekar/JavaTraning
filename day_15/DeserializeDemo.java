package day_15;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializeDemo {
    public static void main(String[] args) throws Exception {

        ObjectInputStream ois =
                new ObjectInputStream(new FileInputStream("student.ser"));

        Student s = (Student) ois.readObject();

        System.out.println("ID: " + s.id);
        System.out.println("Name: " + s.name);
        System.out.println("Password: " + s.password); // null

        ois.close();
    }
}

//password becomes null because it was transient.


//Deserialization (Theory)
//What is Deserialization?
//Converting byte stream → object
//Reverse of serialization
