package com.vinay.sorting;

public class MergeSort {
    // Divide & Conquer NLogN
    public static void conquer(int[] arr, int startIndex, int middle, int endingIndex){
        int[] merged = new int[endingIndex-startIndex + 1];
        int index1 = startIndex;
        int index2 = middle + 1;
        int x = 0;

        while (index1 <= middle && index2 <= endingIndex){
            if (arr[index1] <= arr[index2]){
                merged[x++] = arr[index1++];
            }else {
                merged[x++] = arr[index2++];
            }
        }

        while (index1 <= middle){
            merged[x++] = arr[index1++];
        }

        while (index2 <= endingIndex){
            merged[x++] = arr[index2++];
        }

        for (int i=0, j=startIndex; i<merged.length; i++, j++){
            arr[j] = merged[i];
        }

    }
    public static void divide(int[] arr, int startIndex, int endingIndex){
        if (startIndex >= endingIndex){
            return;
        }

        int middle = startIndex + (endingIndex - startIndex)/2;
        divide(arr, startIndex, middle);
        divide(arr, middle+1, endingIndex);
        conquer(arr, startIndex, middle, endingIndex);

    }

    public static void main(String[] args){
        int[] arr = {6, 3, 9, 5, 2, 8};
        int n = arr.length;
        divide(arr, 0, n-1);
        for (int a: arr){
            System.out.print(a + " ");
        }
        System.out.println();
    }
}
