package com.lti.day4.BankAccount;

public class SavingAccount extends BankAccount{
    double minimumBalance;

    public SavingAccount(){}

    public SavingAccount(long accountNumber, double balance, String accountHolderName) {
        super(accountNumber, balance, accountHolderName);
        this.minimumBalance = balance;
    }

    public void Deposit(double depositAmount){
        if(depositAmount>0){
            this.balance+=depositAmount;
            this.minimumBalance = Math.min(minimumBalance, this.balance);
            System.out.println(depositAmount+"rs credited in your account XXXX"+this.accountNumber+"\nNow current balance is: "+this.balance);
            System.out.println("=============================================================================================");

        }else{
            System.out.println("Please select valid amount for deposit.");
            System.out.println("=============================================================================================");

        }
    }

    public void Withdraw(double withdrawAmount){
        if(withdrawAmount<0){
            System.out.println("Please select valid amount.");
            System.out.println("=============================================================================================");

        }else{
            if(this.balance>=withdrawAmount){
                this.balance-=withdrawAmount;
                this.minimumBalance = Math.min(minimumBalance, this.balance);
                System.out.println(withdrawAmount+"rs withdraw from your account XXXX"+this.accountNumber+"\nNow current balance is: "+this.balance);
                System.out.println("=============================================================================================");

            }else{
                System.out.println("Insufficient balance.");
                System.out.println("=============================================================================================");

            }
        }
        
    }

    // Add Interest method for adding interest on mi nimum balance at end of the month
    public void addInterest(){
        // double interest = this.minimumBalance;
        this.balance+= this.minimumBalance*0.03;
        System.out.println(this.minimumBalance*(0.03)+"rs credited in your account as interest.");
        System.out.println("=============================================================================================");
    }

    // parent abstract method for finding 
    public void endOfMonth(){
        System.out.println("End of month");
        System.out.println("=============================================================================================");
    }
    
}
