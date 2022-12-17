package javaapplication281;

public class Bank {

    private String number;
    private double balance;
    private String name;
    private String email;
    private String mobileNmb;

    public void deposit(double depositAmount) {
        this.balance+=depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + balance);
    }
    
    public void withdrawal(double withdrawalAmount) {
        if (balance-withdrawalAmount<=0) {
            System.out.println("Only " + balance + " available. Withdrawal not processed");
        } else {
            balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance = " + balance);
        }
    }
    
    public void setNumber(String number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMobileNmb(String mobileNmb) {
        this.mobileNmb = mobileNmb;
    }

    public String getAccountNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getMobileNmb() {
        return number;
    }

}
