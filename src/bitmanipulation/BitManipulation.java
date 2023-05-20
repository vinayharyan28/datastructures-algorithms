package bitmanipulation;

public class BitManipulation {
    public static void main(String[] args){
        // get bit
        // get the 3rd bit (position=2) of a number n. (n=0101)
        // bit mask: 1<<i, Operation And
        int n = 5;
        int pos = 2;
        int bitMask = 1 << pos;
        if ((bitMask & n) == 0 ){
            System.out.println("bit was zero");
        }else{
            System.out.println("bit was one");
        }

        // set bit
        int sn = 5;
        int sPos = 1;
        int sBitMask = 1 << sPos;
        int newNumber = sBitMask | sn;
        System.out.println(newNumber);

        // clear bit
        int cn = 5;
        int cPos = 2;
        int cBitMask = 1 << cPos;
        int notBitMask = ~(cBitMask);
        int cNewNumber = notBitMask & cn;
        System.out.println(cNewNumber);


        // update bit
        int un = 5;
        int uPos = 1;
        int operation = 1; // update bit to 1 else update bit to 0
        int uBitMask = 1<<uPos;
        // set operation
        if (operation == 1){
            //set
            int uNewNumber = uBitMask | un;
            System.out.println(uNewNumber);
        }else{
            //clear
            int newBitMask = ~(bitMask);
            int uNewNumber = newBitMask & un;
            System.out.println(uNewNumber);
        }



    }
}
