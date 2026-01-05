package day_3;

public class overloadingExample {

    static void calc(int a, int b){
        int sum = a + b;
        System.out.println(sum);
    }

    static void calc(int a,int b, int c){
        int sum = a + b + c;
        System.out.println(sum);

    }

    static int add(int a, int b) {
        return a + b;
    }
    static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(add(5, 10));
        System.out.println(add(5, 10, 15));
        calc(2,4);
        calc(1,2,3);
    }
}
