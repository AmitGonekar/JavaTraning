package day_2;

public class JumpStatement {
        public static void main(String[] args) {

            for (int i = 1; i <= 5; i++) {
                if (i == 4) {
                    break; // exits loop
                }
                System.out.println(i);
            }
        }
}
