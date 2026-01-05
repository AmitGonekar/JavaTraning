package day_1;

public class primitiveDemonstrate
{

    static void changePrimitive(int x) {
        x = 50;
    }

    static void changeReference(int[] arr) {
        arr[0] = 50;
    }

    public static void main(String[] args) {
        int a = 10;
        changePrimitive(a);
        System.out.println("Primitive value: " + a);

        int[] b = {10};
        changeReference(b);
        System.out.println("Reference value: " + b[0]);
    }
}

