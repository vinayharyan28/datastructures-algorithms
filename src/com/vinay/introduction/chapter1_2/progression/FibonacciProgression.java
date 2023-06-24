package com.vinay.introduction.chapter1_2.progression;

public class FibonacciProgression extends Progression{
    protected long prev;
    // constructs traditional fibonacci, starting 0, 1, 1, 2, 3, ...

    public FibonacciProgression(long first, long second){
        super(first);
        prev = second - first; // fictitious value preceding the first
    }

    public FibonacciProgression(){
        this(0, 1);
    }

    protected void advance(){
        long temp = prev;
        prev = current;
        current += temp;
    }
}
