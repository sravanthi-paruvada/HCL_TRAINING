package com.lab2.q4;

public class Student {
	String name;
	int id;
	String grade;
	
	public Student(String name, int id, String grade) {
		
		this.name = name;
		this.id = id;
		this.grade = grade;
	}
	
	public Student(String name, int id) {
		
		this.name = name;
		this.id = id;
		
	}
	
	public Student(int id) {
		this.id = id;
	}
	
	void display() {
		System.out.println("Name "+name+ "  ID  "+id+"  Grade "+grade);
	}
	
	void display(int year) {
		System.out.println("Name "+name+ "  ID  "+id+"  Grade "+grade+ " Year "+year);
	}
	
	

}