package day_8;


class ArrayDemo {
    public static void main(String[] args) {

        // Declaration & Initialization
        int[] numbers = {10, 20, 30, 40, 50};

        // Accessing elements
        System.out.println("First element: " + numbers[0]);
        System.out.println("Array length: " + numbers.length);

        // Printing all elements
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + " -> " + numbers[i]);
        }
    }
}
