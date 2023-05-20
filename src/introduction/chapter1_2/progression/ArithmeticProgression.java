package introduction.chapter1_2.progression;

public class ArithmeticProgression extends Progression{
    protected long increment;

    // Constructs progression 0, 1, 2, ...
    public ArithmeticProgression(long stepSize, long start){
        super(start);
        increment = stepSize;
    }
    public ArithmeticProgression(long stepSize){
        this(stepSize, 0);
    }
    public ArithmeticProgression(){
        this(1, 0);
    }

    protected void advance(){
        current += increment;
    }
}
