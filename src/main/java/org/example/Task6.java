package org.example;

public class Task6 {
    private static int countVowels(String str) {
        return str.replaceAll("[^aeiouAEIOU]", "").length();
    }

    public static void main(String[] args) {
        System.out.println(countVowels("documentation"));
    }
}

