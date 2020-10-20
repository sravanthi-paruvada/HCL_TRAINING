package day3.q1;

public class CommissionEmployee extends Employee{
	
	private float salesPercent;
	private int weeklySale;
	
	public CommissionEmployee(float salesPercent, int weeklySale) {
		
		this.salesPercent = salesPercent;
		this.weeklySale = weeklySale;
	}
	
	public double getSalary() {
		
		return (salesPercent*weeklySale)/100;
	}
	
	

}
