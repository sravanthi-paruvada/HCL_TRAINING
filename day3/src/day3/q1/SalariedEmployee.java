package day3.q1;

class SalariedEmployee extends Employee{
	private double weekSalary;
	
	
	public SalariedEmployee(double weekSalary) {
		
		this.weekSalary = weekSalary;
	}

	
	public double getSalary() {
		
		return weekSalary;
	}
	
	

}
