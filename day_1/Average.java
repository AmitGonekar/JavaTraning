package day_1;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        System.out.println("Enter five numbers");
        for (int i = 1; i <= 5; i++) {
            sum = sum + sc.nextInt();
        }
        System.out.println("Average: " + (sum / 5));
        sc.close();
    }

}
