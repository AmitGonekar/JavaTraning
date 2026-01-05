package day_9;

// -> Using Comparable

public class Student implements Comparable<Student> {
    int id;
    String name;

    //Constructor
    Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    // compareTo method (sorting by id)
    @Override
    public int compareTo(Student s) {
        return this.id - s.id;   // ascending order
    }

}

    //What is Comparable?
    //Used to define natural/default sorting order
    //Sorting logic is written inside the same class
    //Has only one method
    //int compareTo(Object o);
    //Rule of compareTo()
    //return 0 → both equal
    //return positive → current object is greater
    //return negative → current object is smaller
