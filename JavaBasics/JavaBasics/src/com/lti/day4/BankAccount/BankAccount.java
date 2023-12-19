package com.lti.day4.BankAccount;

public abstract class BankAccount {
    long accountNumber;
    double balance;
    String accountHolderName;

    // default constructor
    public BankAccount(){}

    // cunstructor
    public BankAccount(long accountNumber, double balance, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }

    // Deposit method common for all account type
    public abstract void Deposit(double depositAmount);

    // Withdraw method common for all account type
    public abstract void Withdraw(double withdrawAmount);

    // End of Month abstract method
    public abstract void endOfMonth();

    // to string to print the details
    @Override
    public String toString() {
        return "BankAccount [accountNumber=" + accountNumber + ", balance=" + balance + ", accountHolderName="
                + accountHolderName + "]";
    }

    // ==================== Main Method ========================
    public static void main(String[] args) {
        System.out.println("=============================================================================================");
        // SavingAccount s = new SavingAccount(100, 10000, "Abhishek");
        // s.Deposit(100);
        // s.addInterest();
        // s.Withdraw(1000);
        // s.endOfMonth();
        // System.out.println(s.minimumBalance);
        // s.addInterest();
        // CheckingAccount c = new CheckingAccount(1001, 100000, "Sita");
        // c.Deposit(1200);
        // c.Withdraw(2000);
        // c.Withdraw(300);
        // c.deductFee();
        
    }
    
}
