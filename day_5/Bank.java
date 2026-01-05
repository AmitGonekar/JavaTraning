package day_5;

class Bank {
     static void getRate(){
         System.out.println("Account Created");
     }
}

    // Method overriding

class SBI extends Bank {
    static void getRate() {
        System.out.println("Recreated");
    }

    public static void main(String[] args) {
        Bank b = new SBI(); // Upcasting
        b.getRate();
    }
}
