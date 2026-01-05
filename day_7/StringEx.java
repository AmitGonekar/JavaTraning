package day_7;

public class StringEx {
    public static void main(String[] args) {


        //Why?
        // String is immutable
        //Every modification creates a new object
        //Safe, secure, and memory-optimized via String Pool
       // Use String when:


//Text is constant or rarely changes
// You need thread safety by default
// Used as keys, passwords, URLs, config values


        //Do NOT use String when:
        // Concatenation inside loops
        // Heavy text modification

        String name = "Manprit Singh";
        String role = "Software Engineer";
        String url = "jdbc:mysql://localhost:3306/db";
    }
}
