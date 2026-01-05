package day_1;

import java.util.Scanner;

public class MenuCalculator {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int choice = sc.nextInt();
            int a = 10, b = 5;

            switch (choice) {
                case 1:
                    System.out.println(a + b);
                    break;
                case 2:
                    System.out.println(a - b);
                    break;
                case 3:
                    System.out.println(a * b);
                    break;
                case 4:
                    System.out.println(a / b);
                    break;
                case 0: System.exit(0);
            }
        }
    }