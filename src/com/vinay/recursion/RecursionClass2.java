package com.vinay.recursion;

public class RecursionClass2 {
    public static void towerOfHanoi(int n, String src, String helper, String dest){
        if (n==1){
            System.out.println("Transfer disk "+ n + " from " + src + " to " + dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
        towerOfHanoi(n-1, helper, src, dest);
    }

    public static void reverseString(String str, int index){
        if (index == 0){
            System.out.println(str.charAt(index));
            return;
        }
        System.out.println(str.charAt(index));
        reverseString(str, index-1);
    }

    public static int first = -1;
    public static int last = -1;
    public static void findOccurrence(String str, int index, char element){
        if (index == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = str.charAt(index);
        if (currChar == element){
            if (first == -1){
                first = index;
            }else {
                last = index;
            }
        }
        findOccurrence(str, index+1, element);
    }

    public static boolean isSorted(int[] arr, int index){
        if (index == arr.length-1){
            return true;
        }

        if (arr[index] >= arr[index + 1]){
            return false;
        }else{
            return isSorted(arr, index+1);
        }
    }

    public static void moveAllX(String str, int index, int count, String newString){
        if (index == str.length()){
            for (int i=0; i<count; i++){
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(index);
        if (currChar == 'x'){
            count++;
            moveAllX(str, index+1, count, newString);
        }else{
            newString += currChar;
            moveAllX(str, index+1, count, newString);
        }
    }

    public static void main(String[] args){
        int n=3;
        towerOfHanoi(n, "S", "H", "D");
        reverseString("abcd", "abcd".length()-1);
        String str = "abaacdaefaah";
        findOccurrence(str, 0, 'a');
        int[] arr = {1, 3, 3, 5};
        System.out.println(isSorted(arr, 0));
        String str1 = "axbcxxd";
        moveAllX(str, 0, 0, "");
        // find first & last occurrence
        // master therm
    }

}
