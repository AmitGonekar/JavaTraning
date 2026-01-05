package day_12;

public class ReverseString {

    //Recursion method
    static String rever(String st){
        if(st.isEmpty())
            return st;
        return rever(st.substring(1)) + st.charAt(0);
    }

    public static void main(String[] args) {
        String str = "Amit";
        String reverse = "";

        // using loop from last character to first
        // Explanation  -> length() - 1 → last index
        //charAt(i) → fetch each character from end
        //We keep adding characters to reverse

        for (int i = str.length()-1; i >= 0; i--){
            reverse = reverse + str.charAt(i);
        }
        System.out.println("Reverse string Using Loop -> "+ reverse);


        // Using StringBuilder
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println("Reverse String using StringBuilder ->  " + sb);

        //using recursion
        System.out.println("Reverse String Using recursion -> "+rever(str));

    }
}
