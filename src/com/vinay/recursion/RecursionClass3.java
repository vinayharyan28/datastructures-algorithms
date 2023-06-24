package com.vinay.recursion;

import java.util.HashSet;

public class RecursionClass3 {
    public static boolean[] map = new boolean[26];

    public static void removeDuplicates(String str, int index, String newString){
        if (index == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(index);
        if (map[currChar - 'a']){
            removeDuplicates(str, index+1, newString);
        }else {
            newString += currChar;
            map[currChar - 'a'] = true;
            removeDuplicates(str, index+1, newString);
        }
    }

    public static void subSequences(String str, int index, String newString){
        if (index == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(index);
        // to be
        subSequences(str, index+1, newString+currChar);

        // or not be
        subSequences(str, index+1, newString);
    }

    public static void uniqueSubSequences(String str, int index, String newString, HashSet<String> set){
        if (index == str.length()){
            if (!set.contains(newString)) {
                System.out.println(newString);
                set.add(newString);
            }
            return;
        }
        char currChar = str.charAt(index);
        // to be
        uniqueSubSequences(str, index+1, newString+currChar, set);

        // or not be
        uniqueSubSequences(str, index+1, newString, set);
    }

    public static String[] keypad = {".", "abc", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static void printCombination(String str, int index, String combination){
        if (index == str.length()){
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(index);
        String mapping = keypad[currChar - '0'];
        for (int i=0; i<mapping.length(); i++){
            printCombination(str, index+1, combination+mapping.charAt(i));
        }
    }


    public static void main(String[] args){
        String str = "abbccda";
        String str1 = "abc";
        String str2 = "aaa";
        // unique subsequences
        HashSet<String> set = new HashSet<>();
        removeDuplicates(str, 0, "");
        subSequences(str1, 0, "");
        uniqueSubSequences(str2, 0, "", set);
        String str3 = "4";
        printCombination(str3, 0, "");

    }
}
