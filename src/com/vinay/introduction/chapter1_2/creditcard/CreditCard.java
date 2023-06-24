package com.vinay.introduction.chapter1_2.creditcard;

public class CreditCard {
    private String customer;
    private String bank;
    private String account;
    private int limit;
    protected double balance;

    public CreditCard(String customer, String bank, String account, int limit, double initialBal){
        this.customer = customer;
        this.bank = bank;
        this.account = account;
        this.limit = limit;
        this.balance = initialBal;
    }

    public CreditCard(String customer, String bank, String account, int limit){
        this(customer, bank, account, limit, 0.0); // use a balance of zero as default
    }

    public String getCustomer(){
        return customer;
    }

    public String getBank(){
        return bank;
    }

    public String getAccount(){
        return account;
    }

    public int getLimit(){
        return limit;
    }

    public double getBalance(){
        return balance;
    }

    // update methods
    public boolean charge(double price){
        if (price + balance > limit){
            return false;
        }
        balance += price;
        return true;
    }

    public void makePayment(double amount){
        balance -= amount;
    }

    public static void printSummary(CreditCard creditCard){
        System.out.println("customer = " + creditCard.customer);
        System.out.println("Bank = " + creditCard.bank);
        System.out.println("Account = " + creditCard.account);
        System.out.println("Balance = " + creditCard.balance);
        System.out.println("limit " + creditCard.limit);
    }

    public static void main(String[] args){
        CreditCard[] wallet = new CreditCard[3];
        wallet[0] = new CreditCard(
                "John Bowman",
                "California Savings",
                "5391 0375 9387 5309",
                5000
        );

        wallet[1] = new CreditCard(
                "John Bowman",
                "California Federal",
                "3485 0399 3395 1954",
                3500
        );

        wallet[2] = new CreditCard(
                "John Bowman",
                "California Finance",
                "5391 0375 9387 5309",
                2500,
                300
        );

        for (int val=1; val<=16; val++){
            wallet[0].charge(3*val);
            wallet[1].charge(2*val);
            wallet[2].charge(val);
        }

        for (CreditCard card: wallet){
            CreditCard.printSummary(card);
            System.out.println(card.getBalance());
            while (card.getBalance() > 200.0){
                card.makePayment(200);
                System.out.println("New balance = " + card.getAccount());
            }
        }
    }
}
