package com.vinay.recursion;

public class RecursionClass1 {
    public static void printNumber(int n){
        if (n==0){ // base case
            return;
        }
        System.out.println(n);
        printNumber(n-1);
    }

    public static void printSum(int i, int n, int sum){
        if (i==n){
            sum += i;
            System.out.println(sum);
            return;
        }

        sum += i;
        printSum(i+1, n, sum);
    }

    public static int calcFactorial(int n){
        if (n==1 || n==0){
            return 1;
        }
        int factNumber1 = calcFactorial(n-1);
        int factN = n * factNumber1;
        return factN;
    }

    public static void printFib(int a, int b, int n){
        if (n==0){
            return;
        }
        int c = a + b;
        System.out.println("test --> " + c);
        printFib(b, c, n-1);
    }

    public static int calcPower(int x, int n){
        if (n==0){
            return 1;
        }

        if (x==0){
            return 0;
        }
        int xPowNm1 = calcPower(x, n-1);
        int xPowN = x * xPowNm1;
        return xPowN;
    }

    public static int optimizeCalPower(int x, int n){
        if (n==0){
            return 1;
        }

        if (x==0){
            return 0;
        }

        if (n%2 == 0){
            return optimizeCalPower(x, n/2) * optimizeCalPower(x, n/2);
        }else {
            return optimizeCalPower(x, n/2) * calcPower(x, n/2) * x;
        }
    }

    public static void main(String[] args){
        int n=5;
        int a=0, b=1;
        printNumber(6);
        printSum(1, 5, 0);
        System.out.println(calcFactorial(n));
        int fibN = 7;
        printFib(a, b, fibN-2);
        System.out.println(calcPower(2, 5));
        System.out.println(optimizeCalPower(2, 5));
    }
}
