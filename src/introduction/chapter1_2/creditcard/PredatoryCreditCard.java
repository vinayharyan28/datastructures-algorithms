package introduction.chapter1_2.creditcard;

public class PredatoryCreditCard extends CreditCard {
    private double apr; // annual
    public PredatoryCreditCard(
            String customer, String bank,
            String account, int limit,
            double initialBalance, double rate
    ){
        super(customer, bank, account, limit, initialBalance);
        apr = rate;
    }

    // A new method for assessing monthly charge
    public void processMonth(){
        if (balance > 0){
            double monthlyFactor = Math.pow(1 + apr, 1.0/12); // compute monthly rate
            balance *= monthlyFactor; // assess interest
        }
    }

    // Overriding the charge method defined in the superclass
    public boolean charge(double price){
        boolean isSuccess = super.charge(price); // call inherited method
        if (!isSuccess){
            balance += 5; // asses a $5 penalty
        }return isSuccess;
    }

}
