package day_7;

// Why? use
//Mutable
//No synchronization → very fast
//Modifies same object → memory efficient

//Use StringBuilder when:
// App is single-threaded
// You are using loops
//  Large text processing
//  Performance matters

public class StringBuilderExample {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 5; i++) {
            sb.append(i).append(" ");
        }

        System.out.println(sb.toString());
    }
}

