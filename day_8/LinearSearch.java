package day_8;


class LinearSearch {
    public static void main(String[] args) {

        int[] arr = {5, 8, 2, 9, 1};
        int key = 9;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                found = true;
                System.out.println("Element found at index " + i);
                break;
            }
        }
        if (!found) {
            System.out.println("Element not found");
        }
    }
}

