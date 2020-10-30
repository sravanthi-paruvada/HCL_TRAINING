package com.lab2.q5;

public class Car extends Vehicle{
	int noOfDoor;
	public Car(int noOfWheels, int noOfPassenger, int model, String make,int noOfDoor) {
		super(noOfWheels, noOfPassenger, model, make);
		this.noOfDoor=noOfDoor;
		
	}
	
	void display() {
	    super.display();
		System.out.println(" no of doors:  " +noOfDoor);
	}
	
	

}