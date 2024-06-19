package org.example;

public class Task1_2 {
    //Write a program to swap 2 String without a temporary variable?
    public static void main(String[] args) {
    String str1 = "Hello";
    String str2 = "World";

    str1 = str1 + str2;
    str2 = str1.replace(str2,"");
    str1=str1.replace(str2,"");

        System.out.println(str1);
        System.out.println(str2);
}
}
