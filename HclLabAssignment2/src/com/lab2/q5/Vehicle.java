package com.lab2.q5;

public class Vehicle {

	int noOfWheels;
	int noOfPassenger;
	int model;
	String make;
	
	public Vehicle(int noOfWheels, int noOfPassenger, int model, String make) {
		
		this.noOfWheels = noOfWheels;
		this.noOfPassenger = noOfPassenger;
		this.model = model;
		this.make = make;
	}
	
	void display() {
		
		System.out.println(" Wheels: "+noOfWheels+ " No of seats: "+noOfWheels+ " model: "+model+  " make "+make);
	}
	
}