package com.vinay.sorting;

public class QuickSort {
    // Pivot & Partition
    // Pivot -- random, medium, 1st element, last element
    // take last element pivot
    // worst O(n2) else n log n
    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low - 1;
        for (int j=low; j<high; j++){
            if (arr[j] < pivot){
                i++;
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i; // pivot index
    }
    public static void quickSort(int[] arr, int low, int high){
        if (low < high){
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex-1);
        }
    }

    public static void main(String[] args){
        int[] arr = {6, 3, 9, 5, 2, 8};
        int n = arr.length;
        quickSort(arr, 0, n-1);
        for (int a: arr){
            System.out.print(a + " ");
        }
    }
}
