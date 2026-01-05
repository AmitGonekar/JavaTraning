package day_8;

public class IterationOfLoops {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};


        //For Loop
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


        // For Each Loop
        for (int value : arr) {
            System.out.println(value);
        }

        // While Loop
        int i = 0;
        while (i < arr.length) {
            System.out.println(arr[i]);
            i++;
        }

    }
}
