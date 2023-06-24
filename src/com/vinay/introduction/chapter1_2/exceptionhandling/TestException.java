package com.vinay.introduction.chapter1_2.exceptionhandling;

public class TestException {
    public static void main(String[] args){
        int n =2;
        try{
            n = Integer.parseInt(args[0]);
            if (n <= 0){
                System.out.println("n must be positive using default");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("No argument specified for n. using default");
        }catch (NumberFormatException e){
            System.out.println("Invalid Integer argument. using default");
        }
    }
}
