package day3.q3;

public abstract class Employee {
	
	abstract double getSalary();
	
	abstract void setSalary(double salary);
	
   
}

class SalariedEmployee extends Employee implements Payable{

	double weekSalary;
	public SalariedEmployee(double weekSalary) {
		
		this.weekSalary = weekSalary;
	}

	@Override
	public double getPayment() {
		
		
		return weekSalary;
	}

	@Override
	double getSalary() {
		
		return weekSalary;
	}

	@Override
	void setSalary(double weekSalary) {
		this.weekSalary = weekSalary;
		
	}
	
}


class HourlyEmployee extends Employee implements Payable{

	private double hourlySalary;
	private int hours;
	
	public HourlyEmployee(double hourlySalary,int hours) {
		this.hourlySalary =hourlySalary;
		this.hours=hours;
		
	}

	@Override
	public double getPayment() {
		
		
		return hourlySalary*hours;
	}

	@Override
	double getSalary() {
		
		return hourlySalary*hours;
	}

	@Override
	void setSalary(double hourlySalary) {
		this.hourlySalary =hourlySalary;
		
	}
	
}


class CommissionEmployee extends Employee implements Payable{

	private float salesPercent;
	private int weeklySale;
	
	
	public CommissionEmployee(float salesPercent, int weeklySale) {
		
		this.salesPercent = salesPercent;
		this.weeklySale = weeklySale;
	}

	@Override
	public double getPayment() {
		
		
		return (salesPercent*weeklySale)/100;
	}

	@Override
	double getSalary() {
		
		return (salesPercent*weeklySale)/100;
	}

	@Override
	void setSalary(double commission) {
		this.salesPercent =salesPercent;
	}
	
}

