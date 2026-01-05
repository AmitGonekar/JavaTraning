package day_7;

public class StringMethodsDemo {

    public static void main(String[] args) {

        //All Methods inside String Classes.

        // 1. Creating a String object
        String name = "Amit";

        // length() → returns number of characters
        System.out.println("Length of string: " + name.length());

        // toUpperCase() → converts string to uppercase
        System.out.println("Uppercase: " + name.toUpperCase());

        // toLowerCase() → converts string to lowercase
        System.out.println("Lowercase: " + name.toLowerCase());

        // charAt() → returns character at given index
        System.out.println("Character at index 1: " + name.charAt(1));

        // equals() → compares content of strings
        System.out.println("Is equal to Amit: " + name.equals("Amit"));

        // replace() → returns a new string with replaced value
        String replacedName = name.replace("Amit", "Boby");
        System.out.println("After replace: " + replacedName);

        // substring() → extracts part of string
        System.out.println("Substring (0 to 2): " + name.substring(0, 2));

        // contains() → checks if string contains given value
        System.out.println("Contains 'mi': " + name.contains("mi"));

        // startsWith() → checks starting characters
        System.out.println("Starts with 'A': " + name.startsWith("A"));

        // endsWith() → checks ending characters
        System.out.println("Ends with 't': " + name.endsWith("t"));

        // trim() → removes leading and trailing spaces
        String withSpaces = "  Hello Java  ";
        System.out.println("Before trim: '" + withSpaces + "'");
        System.out.println("After trim: '" + withSpaces.trim() + "'");

        // isEmpty() → checks if string is empty
        String empty = "";
        System.out.println("Is empty string: " + empty.isEmpty());
    }
}

