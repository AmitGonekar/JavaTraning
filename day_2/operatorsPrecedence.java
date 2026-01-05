package day_2;

public class operatorsPrecedence {
        public static void main(String[] args) {
            int result1 = 10 + 5 * 2;      // * has higher precedence
            int result2 = (10 + 5) * 2;    // parentheses override

            System.out.println(result1);
            System.out.println(result2);
        }
}
