package day_15;

import java.io.Serializable;

// Serializable Class

public class Student implements Serializable {
    int id;
    String name;
    transient String password;  // not serialized

    //The transient keyword in Java is used to indicate that a field should not be included in the default serialization process.


    public Student(String name, String password, int id) {
        this.id = id;
        this.name = name;
        this.password = password;

    }
}
