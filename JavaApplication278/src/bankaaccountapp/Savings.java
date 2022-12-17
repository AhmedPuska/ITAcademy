package bankaaccountapp;

import java.util.Random;

public class Savings extends Account {

    // List properties specific to the Savings account
//    Random random = new Random();
//    String safetyDepositBoxKeyRandom = String.format("%04d", random.nextInt(10000));
//    String safetyDepositBoxIDRandom = String.format("%03d", random.nextInt(1000));
    private int safetyDepositBoxID /*= Integer.parseInt(safetyDepositBoxIDRandom)*/;
    private int safetyDepositBoxKey /*= Integer.parseInt(safetyDepositBoxKeyRandom)*/;

    // Constructor to initialize settings for the Savings properties
    public Savings(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
//        System.out.println(safetyDepositBoxID + " Key " + safetyDepositBoxKey);
    }

    @Override
    public void setRate() {
        rate = getBaseRate() - .25;
    }
    
    
    
    private void setSafetyDepositBox() {
        safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
        safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
    }
    
    // List any methods specifics to savings account
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(
                " Your Savings Account Features" +
                        "\n Safety Deposit Box ID: " + safetyDepositBoxID +
                        "\n Safety Deposit Box Key: " +safetyDepositBoxKey);
    }
}
