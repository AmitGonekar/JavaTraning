package day_3;

public class methodsInJava {

    // Example of - Java methods support both primitive and object parameters.
    static void changeValue(int x){
        int a = 10;
        System.out.println("Inside method value of a "+a);
    }

    public static void main(String[] args) {
        int a = 5;
        System.out.println("Before calling method value of a is "+ a);
        changeValue(a);
        System.out.println("After calling method value of a is "+ a);
    }
}