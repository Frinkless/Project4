package org.example;

import java.util.ArrayList;
import java.util.List;


public class Task8 {
    //You have a list of strings and you want to keep only those that start with
    //“A” and you want to return them in lower case".
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Apple");
        strings.add("Banana");
        strings.add("Peach");
        strings.add("Carrot");
        strings.add("Apricot");

        List<String> filteredStrings = new ArrayList<>();
        for (String s : strings) {
            if (s.startsWith("A")) {
                filteredStrings.add(s.toLowerCase());
            }
        }

        System.out.println(filteredStrings);
    }
}
