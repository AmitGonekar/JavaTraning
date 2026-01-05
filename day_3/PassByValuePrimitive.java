package day_3;

public class PassByValuePrimitive {

    // For primitive

    static void change(int x){
        int a = 50;
        System.out.println(a);
    }

    public static void main(String[] args) {
        int b = 10;
        System.out.println(b);
        change(b);
    }
}
