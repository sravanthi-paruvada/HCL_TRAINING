package com.lab4.q5;

import java.util.Scanner;

class Check {
	private int num;
	public static void checkNum(int num) throws NumExceedException {
		if(num>100)
			throw new NumExceedException("Number can't be greater than 100");
	
	}
}
public class NumTester {
	public static void main(String []args) {
		System.out.println("Enter a number or enter -1 to exit the system");
		int number=0;
		Check check=new Check();
		try(Scanner scan=new Scanner(System.in);){
			
			 number =scan.nextInt();
			Check.checkNum(number);
			
			
		}
		catch(NumExceedException ex) {
			System.out.println(ex.getMessage());
		}
	}

}
