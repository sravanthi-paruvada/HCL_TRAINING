package com.lab4.q4;

import java.util.InputMismatchException;
import java.util.Scanner;

class Check {
	private int num;
	public void Even(int num) throws InputMismatchException {
		if(num<=0)
			throw new InputMismatchException();
		else if(num%2==0)
			System.out.println("You entered an even number.");
		else
			System.out.println("You entered odd number");
		
	}
}
public class EvenOdd {
	public static void main(String []args) {
		System.out.println("Enter a number or enter -1 to exit the system");
		int number=0;
		Check check=new Check();
		try(Scanner scan=new Scanner(System.in);){
			
			 number =scan.nextInt();
			
			if(number!=-1) 
				check.Even(number);
			else
				System.exit(-1);
			
		}
		catch(InputMismatchException ex) {
			System.out.println(ex.getMessage());
		}
	}
	

}
