package day_4;

// Classes and object

class Student {
    int id;
    String name;
}

 class Main {
    public static void main(String[] args) {
        Student s1 = new Student(); // object
        s1.id = 1;
        s1.name = "Amit";
        System.out.println(s1.id + " " + s1.name);
    }
}

