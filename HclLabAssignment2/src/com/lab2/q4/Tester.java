package com.lab2.q4;

public class Tester {
	public static void main(String []args) {
		Student student= new Student("Sravanthi",276,"A");
		student.display();
		Student student1= new Student("Sri",345,"C");
		student1.display(2020);
		
		Student student2= new Student("Sravanthi",276);
		student2.display();
		
		Student student3= new Student(276);
		student3.display(2020);
		
		
	}

}