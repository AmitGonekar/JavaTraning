package day_4;

public class Bank {     // Inheritence
    void working(){
        System.out.println("Working");
    }
}

class Emp extends Bank{             // Is a relationship
    void working(){
        System.out.println("Working for bank");
    }
}
