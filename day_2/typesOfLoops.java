package day_2;

public class typesOfLoops {
        public static void main(String[] args) {

            // for loop
            System.out.println("For Loop:");
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
            }

            // while loop
            System.out.println("\nWhile Loop:");
            int j = 1;
            while (j <= 5) {
                System.out.println(j);
                j++;
            }

            // do-while loop
            System.out.println("\nDo-While Loop:");
            int k = 1;
            do {
                System.out.println(k);
                k++;
            } while (k <= 5);

            //  Enhanced for loop (for-each loop)
            System.out.println("\nEnhanced For Loop:");
            int[] numbers = {10, 20, 30, 40, 50};
            for (int num : numbers) {
                System.out.println(num);
            }
        }
    }