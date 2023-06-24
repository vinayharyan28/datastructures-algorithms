package com.vinay.introduction.chapter1_2.progression;

public class GeometricProgression extends Progression{
    protected long base;
    // Constructs progression 1, 2, 4, 8, 16
    public GeometricProgression(long b, long start){
        super(start);
        base = b;
    }
    public GeometricProgression(){ // start at 1 with base of 2
        this(2, 1);
    }

    public GeometricProgression(long b){
        this(b,1); // start at 1
    }

    // Multiplies the current value by the geometric base
    protected void advance(){
        current *= base; // multiply current by the geometric base
    }

}
