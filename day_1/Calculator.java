package day_1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //For Addition
        System.out.println("Enter first digit");
        int a = sc.nextInt();
        System.out.println("Enter second digit");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("Total sum of digits is "+ sum);

        //For Substraction
        System.out.println("Enter first digit");
        int c = sc.nextInt();
        System.out.println("Enter second digit");
        int d = sc.nextInt();
        int subs = c-d;
        System.out.println("Substrsction value is "+subs);

        //For Multiplication
        System.out.println("Enter first digit");
        int e = sc.nextInt();
        System.out.println("Enter Second digit");
        int f = sc.nextInt();
        int multi = e*f;
        System.out.println("Multipliction of the value is "+multi);

        //For Divide
        System.out.println("Enter first digit");
        int g = sc.nextInt();
        System.out.println("Enter second digit");
        int h = sc.nextInt();
        int div = g/h;
        System.out.println("Divide value of this is "+div);



    }
}
