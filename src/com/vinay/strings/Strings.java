package com.vinay.strings;

public class Strings {
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
//        System.out.println("your name is " + name);
        // concatenation
        String firsName = "tony";
        String lastName = "stark";
        System.out.println(firsName + " " + lastName);
        System.out.println(firsName.length());

        // charAt
        for (int i=0; i<firsName.length(); i++){
            System.out.println(firsName.charAt(i));
        }

        String name1 = "Tony";
        String name2 = "Tony";

        // 1. s1 > s2 : +ve val
        // 2. s1 == s2 : 0
        // 3. s1 < s2 : -ve value
        if (name1.compareTo(name2) == 0){
            System.out.println("String are equal");
        }else{
            System.out.println("Strings are not equal");
        }

        String sentence = "My Name is tony";
        String name = sentence.substring(11, sentence.length());
        System.out.println(name);
    }
}
