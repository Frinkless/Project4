package org.example;

public class Task2 {
    public static void main(String[] args) {
        //Find out how many alpha characters are present in a string?
        String inputString = "Hello123World";

//        System.out.println(inputString.replaceAll("[1-9]","").length());
        System.out.println(inputString.replaceAll("[^A-Za-z]", "").length());
    }}