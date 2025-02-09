package com.Task3;

public class Account {
	private double balance;
	
	  public Account(double initialBalance) {
	        this.balance = initialBalance;
	    }

	    public double getBalance() {	
	        return balance;
	    }

	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Successfully deposited:" + amount);
	            System.out.println("Your Account Balance After Deposit is:" +balance );
	        } else {
	            System.out.println("Deposit amount must be greater than zero.");
	        }
	    }

	    public boolean withdraw(double amount) {
	    		  if(amount<=500) {
	    			  System.out.println("500 is maintenace balace in your account..! Please Enter the amount is grater than 500...");
	    		  }
	    		  else if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Successfully withdrawn:" + amount);
	            System.out.println("Your Account Balance After withdraw is:"+balance);
	            return true;
	        } else if (amount > balance) {
	            System.out.println("Insufficient balance...!");
	            return false;
	        } else {
	            System.out.println("Invalid withdrawal amount...!");
	            return false;
	       
	    }
				return false;
	    	  
			
	    }
}
	
	

