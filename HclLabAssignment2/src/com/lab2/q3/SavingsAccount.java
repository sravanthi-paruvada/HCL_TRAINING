package com.lab2.q3;

public class SavingsAccount extends Account {
	final float interest=5;
	final double maxWithdrawAmount= 20000;
	double accountBalance1;
	public SavingsAccount(String name, double accountBalance) {
		super(name, accountBalance);
		//this.interest=5;
		//this.maxWithdrawAmount=20000;
	}
	
	public double getBalance(double  accountBalance) {
		
		return accountBalance+accountBalance*(5/100);
	}
	
	public double withdraw(double withdrawAmount) {
		if((withdrawAmount<=maxWithdrawAmount)&&(accountBalance>=1000) )
			accountBalance1= accountBalance-withdrawAmount;
		else 
			System.out.println("Exceeded the withdrawl amount");
		return accountBalance1;
	  
	}
	
	
	
}