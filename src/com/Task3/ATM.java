package com.Task3;

import java.util.Scanner;

public class ATM {
	private Account account;
	Scanner sc = new Scanner(System.in);

	public ATM(Account account) {
		super();
		this.account = account;
	}
	  public void displayMenu() {
	        while (true) {
	        	System.out.println("*******************************");
	        	System.out.println("Wellcome to my ATM");
	            System.out.println("ATM Menu:");
	            System.out.println("*******************************");
	            System.out.println("1.Withdraw");
	            System.out.println("2.Deposit");
	            System.out.println("3.Check Balance");
	            System.out.println("4.Exit");
	            System.out.print("Choose an option: ");
	            
	            int choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    Withdrawal();
	                    break;
	                case 2:
	                    Deposit();
	                    break;
	                case 3:
	                    checkBalance();
	                    break;
	                case 4:
	                    System.out.println("Thank you Vist Again.....!");
	                    return;
	                default:
	                    System.out.println("Please try again.");
	            }
	        }
	    }
	  private void Withdrawal() {
	        System.out.print("Enter amount to withdraw: ");
	        double amount = sc.nextDouble();
	        account.withdraw(amount);
	    }

	    private void Deposit() {
	        System.out.print("Enter amount to deposit: ");
	        double amount = sc.nextDouble();
	        account.deposit(amount);
	    }

	    private void checkBalance() {
	        System.out.println("Your balance is: " + account.getBalance());
	    }
	}



	
	
	

