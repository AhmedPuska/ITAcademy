package bankaaccountapp;

import java.util.Random;

public class Checking extends Account {

    // List properties specific to a Checking account
//    Random random = new Random();
//    String debitCardPinRandom = String.format("%04d", random.nextInt(10000));
    private int debitCardNumber;
    private int debitCardPin /*= Integer.parseInt(debitCardPinRandom)*/;
    
    // Constructor to initialize checking account properties
    public Checking(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "2" + accountNumber;
        setDebitCard();
    }

    @Override
    public void setRate() {
        rate = getBaseRate() * .15;
    }
    
    
    
    private void setDebitCard() {
        debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
        debitCardPin = (int) (Math.random() * Math.pow(10, 4));
    }
    
    // List any methods specific to the checking account
    
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Your Checking Account Features" +
                "\n Debit Card Number: " + debitCardNumber +
                "\n Debit Card PIN " + debitCardPin);
        
    }
}
