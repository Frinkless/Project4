package org.example;

public class Task3 {
    public static void main(String[] args) {
        //Reverse a String: Write a function to reverse a given string. For example,
        //given the input "Hello", the output should be "olleH".

        String originalStr="Hello";
        StringBuilder str=new StringBuilder(originalStr);
        System.out.println(str.reverse());
    }
}