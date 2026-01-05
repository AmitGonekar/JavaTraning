package day_1;

public class ifElse {
        public static void main(String[] args) {
            int num = 2;

            // If Else
            if (num == 1) {
                System.out.println("One");
            } else {
                System.out.println("Not One");
            }

            //Switch Case
            switch (num) {
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                default:
                    System.out.println("Other");
            }
        }
    }
