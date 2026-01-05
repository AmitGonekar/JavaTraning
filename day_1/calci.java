package day_1;

import java.util.Scanner;

public class calci {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("--- Menu Calculator ---");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("Exiting program...");
                sc.close();
                return;
            }

            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Result = " + (a + b));
                    break;

                case 2:
                    System.out.println("Result = " + (a - b));
                    break;

                case 3:
                    System.out.println("Result = " + (a * b));
                    break;

                case 4:
                    if (b != 0)
                        System.out.println("Result = " + (a / b));
                    else
                        System.out.println("Division by zero not allowed");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

            sc.close();
        }
    }


