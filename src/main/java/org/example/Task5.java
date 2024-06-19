package org.example;

import java.util.Arrays;

public class Task5 {
    //Check if Two Strings are Anagrams: Given two strings, determine if they
    //are anagrams, meaning they contain the same characters in a different order.
    //For example, "listen" and "silent" are anagrams.

        public static boolean areAnagrams(String str1, String str2) {

            str1 = str1.replaceAll(" ", "").toLowerCase();
            str2 = str2.replaceAll(" ", "").toLowerCase();

            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            return Arrays.equals(charArray1, charArray2);
        }

        public static void main(String[] args) {
            String str1 = "listen";
            String str2 = "silent";

            boolean result=areAnagrams(str1,str2);
            System.out.println(result);

        }
    }
//   String str1="listen";
//        String str2="silent";
//        char [] arr1=str1.toCharArray();
//        char [] arr2=str2.toCharArray();
//        Arrays.sort(arr1);
//        Arrays.sort(arr2);
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));
//        System.out.println(Arrays.equals(arr1,arr2));
//    }
//}
