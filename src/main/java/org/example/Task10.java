package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task10 {
    public static <T> List<T> removeDuplicates(ArrayList<T> list) {
        Set<T> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("One");
        words.add("Two");
        words.add("Three");
        words.add("Two");
        words.add("Four");
        words.add("One");


        List<String> uniqueNumbers = removeDuplicates(words);
        System.out.println(uniqueNumbers);
    }

}
