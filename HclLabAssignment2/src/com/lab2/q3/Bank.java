package com.lab2.q3;

import java.util.Scanner;

public class Bank {
public static void main(String []args) {
	
	
	System.out.println("Enter the name,account balance,trade Licensse number");
	Scanner scanner=new Scanner(System.in);
	String name=scanner.next();
	double accountBalance=scanner.nextDouble();
	double tradeLicenseNum=scanner.nextDouble();
	
	System.out.println("enter to create  1.Savings Account  2.Current Account  ");
	
	int k =scanner.nextInt();
	switch(k) {
	case 1:
		SavingsAccount userAccount=new SavingsAccount(name,accountBalance);
		
		
		System.out.println("enter  0.exit   1.deposite  2.withdrawl  3.Account Balance  ");
		
		int option=scanner.nextInt();
		
		switch(option) {
		
		case 0:
			break;
		
		case 1:
			System.out.println("Enter the deposite money");
			double depositeMoney=scanner.nextDouble();
			System.out.println("Balance before deposite"+userAccount.getBalance(accountBalance));
			System.out.println("Balance after deposite"+(accountBalance+depositeMoney));
			break;
			
		case 2:
			System.out.println("Enter the withdrawl money");
			double withdrawlMoney=scanner.nextDouble();
			System.out.println("Balance before withdrawl"+userAccount.getBalance(accountBalance));
			System.out.println("Balance after withdrawl"+userAccount.withdraw(withdrawlMoney));
			break;
			
		case 3:
			System.out.println("Account Balance "+accountBalance);
			break;
		}
		
		
		break;
		
	case 2:
		CurrentAccount userAccount1=new CurrentAccount(name,accountBalance,tradeLicenseNum);
		
		
		System.out.println("enter  0.exit   1.deposite  2.withdrawl  3.Account Balance  ");
		
		int option1=scanner.nextInt();
		
		switch(option1) {
		
		case 0:
			break;
		
		case 1:
			System.out.println("Enter the deposite money");
			double depositeMoney=scanner.nextDouble();
			System.out.println("Balance before deposite"+userAccount1.getBalance(accountBalance));
			System.out.println("Balance after deposite"+(accountBalance+depositeMoney));
			break;
			
		case 2:
			System.out.println("Enter the withdrawl money");
			double withdrawlMoney=scanner.nextDouble();
			System.out.println("Balance before withdrawl"+userAccount1.getBalance(accountBalance));
			System.out.println("Balance after withdrawl"+userAccount1.withdraw(withdrawlMoney));
			break;
			
		case 3:
			System.out.println("Account Balance "+accountBalance);
			break;
		}
		
		
		break;
	}
	

	scanner.close();
	
}}
