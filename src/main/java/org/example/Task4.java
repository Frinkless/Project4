package org.example;

public class Task4 {
    //Check if a String is Palindrome: Determine whether a given string is a
    //palindrome, which means it reads the same forwards and backward. For
    //example, "madam" is a palindrome.
    public static void main(String[] args) {

        String originalStr = "madam";
        StringBuilder str = new StringBuilder(originalStr);
        str.reverse();
        String reversedStr = str.toString();
        if (originalStr.equalsIgnoreCase(reversedStr)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
