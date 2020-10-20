package day2.sess2;

public class Employee {
	private int id;
	private String Fname;
	private String Lname;
	private double salary;
	
	Employee(int id,String Fname,String Lname,double salary){
		this.id=id;
		this.Fname=Fname;
		this.Lname=Lname;
		this.salary=salary;
	}
	public int getid() {
		return id;
	
	}
	public String getFname() {
		return Fname;
	
	}
	public String getLname() {
		return Lname;
	
	}
	public double salary() {
		return salary;
	}
	public double getRaisedSalary(int per) {
		if((per<0)||per>50)
			return salary;
		else
			return salary+salary*per/100;
	}
	public void print() {
		System.out.println("name "+Fname  +Lname +"Id "+id+ "salary "+ salary);
		
	}
}
