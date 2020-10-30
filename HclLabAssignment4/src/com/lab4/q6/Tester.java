package com.lab4.q6;

import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		try {
			System.out.println("Enter a number");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			try {
				if(num > 100) {
					throw new InputException("number can't be greater than 100");
				}
			} catch (InputException e) {
				System.out.println(e.getMessage());
			}
		}finally {
			System.out.println("Done");
		}
	}
}
