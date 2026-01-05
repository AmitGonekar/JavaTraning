package day_7;

public class Sample {
    public static void main(String[] args) {
        String a = "Amit";

        System.out.println("A Before replace is  "+a);

        a = a.replace("Amit","Boby");  //  String is immutable in Java replace() does NOT change the original string

        // It returns a NEW string You are not storing that returned value so that's why you have to store it in previous string.

        System.out.println("A After replace is "+a);
    }
}
