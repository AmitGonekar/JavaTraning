package day_7;


//Why use because
//Mutable
//Thread-safe (synchronized methods)
//Slower than StringBuilder due to locking


//Use StringBuffer when:
//  Multiple threads modify same string
//  Thread safety is mandatory
//  Legacy applications

public class StringBufferExample {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" World");
        sb.append(" Java");

        System.out.println(sb);
    }
}
