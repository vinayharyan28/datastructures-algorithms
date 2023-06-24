package com.vinay.introduction.chapter1_2.progression;

public class Progression {
    // instance variable
    protected long current;

    // Construct a progression starting at zero;
    public Progression(long start){
        current = start;
    }
    public Progression(){
        this(0);
    }

    protected void advance(){
        current++;
    }

    public long nextValue(){
       long answer = current;
       advance(); // this protected call is responsible for advancing current value
       return answer;
    }

    public void printProgression(int n){
        System.out.print(nextValue()); // print first value without leading space
        for (int j=1; j<n; j++)
            System.out.print(" " + nextValue()); // print leading space before others
        System.out.println(); // ent the line
    }

}
