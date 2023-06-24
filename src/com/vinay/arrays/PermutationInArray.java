package com.vinay.arrays;

public class PermutationInArray {
     static void printPermutation(int[] a, int cid){
        if (cid == a.length-1){
            printArray(a);
            return;
        }

        for (int i=cid; i<a.length; i++){
            swap(a, i, cid);
            printPermutation(a, cid+1);
            swap(a, i, cid);
        }
    }

    static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static void printArray(int[] a){
        System.out.println();
        for (int j : a) {
            System.out.print(j + " ");
        }
    }

    public static void main(String[] args){
        int[] a = {1, 2, 3};
        printPermutation(a, 0);
        printArray(a);
    }
}