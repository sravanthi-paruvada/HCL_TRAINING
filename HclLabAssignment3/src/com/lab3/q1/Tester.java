package com.lab3.q1;

import java.util.Scanner;

public class Tester {
	public static void main(String []args) {
		Employee employee;
		employee= new SalariedEmployee(20000);
		System.out.println("Salaried employee"+employee.getSalary());
		
		employee =new HourlyEmployee(9,20000);
		System.out.println("Hourly employee"+employee.getSalary());
		
		employee =new CommissionEmployee(60,20000);
		System.out.println("Commissioned employee"+employee.getSalary());
		
		System.out.println("Enter the percentage of salary you want to increase");
		
		Scanner scanner=new Scanner(System.in);
		
		float rate;
		rate=scanner.nextFloat();
		
		Employee employeeRate;
		employeeRate =new SalariedEmployee(20000);
		employeeRate.setRate(rate*employeeRate.getSalary());
		System.out.println("Increase in the Salaried Employee: "+(rate*employeeRate.getSalary()-employeeRate.getSalary()));
		
		employeeRate =new HourlyEmployee(8,20000);
		employeeRate.setRate(rate*employeeRate.getSalary());
		System.out.println("Increase in the Hourly Employee: "+(rate*employeeRate.getSalary()-employeeRate.getSalary()));
		
		employeeRate =new CommissionEmployee(9,20000);
		employeeRate.setRate(rate*employeeRate.getSalary());
		System.out.println("Increase in the Commision Employee: "+(rate*employeeRate.getSalary()-employeeRate.getSalary()));
		
		
		scanner.close();
		
	}
}
