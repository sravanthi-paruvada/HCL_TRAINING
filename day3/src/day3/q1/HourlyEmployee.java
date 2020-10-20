package day3.q1;

public class HourlyEmployee extends Employee {
	
	private int noOfHours;
	private int hourlyrate;
	
	public HourlyEmployee(int noOfHours, int hourlyrate) {
		
		this.noOfHours = noOfHours;
		this.hourlyrate = hourlyrate;
	}
	
	public double getSalary() {
		
		return noOfHours*hourlyrate;
		
	}
	
	

}
