package day_12;

public class FactorialRecursion {

    static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // 5! = 5 × 4 × 3 × 2 × 1 = 120 it means multiply in decreasing order

    public static void main(String[] args) {
        int num = 5;
        System.out.println("Factorial: " + factorial(num));
    }
}

