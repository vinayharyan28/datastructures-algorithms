package com.vinay.recursion;

import java.util.ArrayList;

public class RecursionClass4 {
    public static int countPaths(int i, int j, int n, int m){
        if ( i==n || j == m){
            return 0;
        }
        if (i == n-1 && j == m-1){
            return 1;
        }

        // move downwards
        int downPaths = countPaths(i+1, j, n, m);
        // move right path
        int rightPaths = countPaths(i, j+1, n, m);

        return downPaths + rightPaths;
    }

    public static void printPerm(String str, String permutation){
        if (str.length() == 0){
            System.out.println(permutation);
            return;
        }
        for (int i=0; i<str.length(); i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            printPerm(newStr, permutation + currChar);
        }
    }

    public static int placeTiles(int n, int m){
        if (n==m){
            return 2;
        }

        if (n<m){
            return 1;
        }

        // vertically
        int vertPlacements = placeTiles(n-m, m);

        // horizontally
        int horPlacements = placeTiles(n-1, m);

        return vertPlacements + horPlacements;
    }

    public static int callGuests(int n){
        if (n<=1){
            return 1;
        }
        // single
        int ways1 = callGuests(n-1);

        // pair
        int ways2 = (n-1) * callGuests(n-2);
        return ways1 + ways2;
    }

    public static void printSubsets(ArrayList<Integer> subset){
        for (Integer integer : subset) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }

    public static void findSubsets(int n, ArrayList<Integer> subset){
        if (n==0){
            printSubsets(subset);
            return;
        }

        subset.add(n);
        findSubsets(n-1, subset);

        subset.remove(subset.size()-1);
        findSubsets(n-1, subset);
    }




    public static void main(String[] args){
        String str = "abc";
        printPerm(str, "");
        int n = 3, m = 3;
        int totalPaths = countPaths(0, 0, n, m);
        System.out.println(totalPaths);
        System.out.println(placeTiles(4, 2));
        System.out.println(callGuests(4));
        System.out.println("----------------------------------");
        ArrayList<Integer> subset = new ArrayList<>();
        findSubsets(3, subset);
    }
}
