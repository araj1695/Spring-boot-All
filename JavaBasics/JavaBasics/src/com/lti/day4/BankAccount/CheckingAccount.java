package com.lti.day4.BankAccount;

public class CheckingAccount extends BankAccount{
    double transectionFee;
    int freeTransection;

    public CheckingAccount(){}

    public CheckingAccount(long accountNumber, double balance, String accountHolderName) {
        super(accountNumber, balance, accountHolderName);
        this.freeTransection = 5;
    }

    public void Deposit(double depositAmount){
        if(depositAmount>0){
            this.balance+=depositAmount;
            if(this.freeTransection>0){
                this.freeTransection-=1;
            }else{
                System.out.println("Your free transection limit is over, you will be charged 10rs per transection from now.");
                System.out.println("=============================================================================================");
                this.freeTransection-=1;
                this.transectionFee+=10;
            }
            System.out.println(depositAmount+"rs deposited in your account XXXX"+this.accountNumber+"\nNow current balance is: "+this.balance);
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
                if(this.freeTransection>0){
                    this.freeTransection-=1;
                }else{
                    System.out.println("Your free transection limit is over, you will be charged 10rs per transection from now.");
                    System.out.println("=============================================================================================");

                    this.transectionFee+=10;
                }
                System.out.println(withdrawAmount+"rs withdraw from your account XXXX"+this.accountNumber+"\nNow current balance is: "+this.balance);
                System.out.println("=============================================================================================");

            }else{
                System.out.println("Insufficient balance.");
                System.out.println("=============================================================================================");

            }
        }
        
    }

    // Deduction of fee at the end of month if free transection limit is over
    public void deductFee(){
        if(this.transectionFee>0){
            this.balance-=this.transectionFee;
            this.transectionFee=0;
            System.out.println(this.transectionFee+"rs deducted for your account.");
            System.out.println("=============================================================================================");

        }else{
            System.out.println("No transection fee is pending as of now.");
            System.out.println("=============================================================================================");

        }
    }

    // parent abstract method for finding 
    public void endOfMonth(){
        System.out.println("End of month");
        System.out.println("=============================================================================================");

    }
}
