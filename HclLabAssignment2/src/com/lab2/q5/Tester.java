package com.lab2.q5;
import java.util.Scanner;

public class Tester {
	public static void main(String args[]) {
		
		int select;
		System.out.println("Select Case from 1 to 4  1.Vehicle   2.Car   3.Convertible    4.SportsCar");
		Scanner scan=new Scanner(System.in);
		select=scan.nextInt();
		
		switch(select) {
		
		case 1:	
		Vehicle vehicle=new Vehicle(4,5,276,"benz");
		vehicle.display();
		break;
		case 2:
		Car car =new Car(4,4,369,"BMW",4);
		car.display();
		break;
		case 3:
		Convertible convertible=new Convertible(4,4,2343,"Mini Cooper",2,true);
		convertible.display();
		break;
		case 4:
		SportCar sportcar=new SportCar(4,2,445,"Ford",2);
		sportcar.display();
		break;
		}
		scan.close();
	}

}
