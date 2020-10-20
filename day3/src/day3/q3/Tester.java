package day3.q3;



public class Tester {
	
	public static void main(String []args) {
		//Employee employee;
		CommissionEmployee employee= new CommissionEmployee(50,1000);
		System.out.println("Salaried employee  "+employee.getPayment());
		
		
		Invoice invoice=new Invoice("1313","salary",20,500);
		System.out.println("Payment "+invoice.getPayment());
		invoice.display();		
		
	}
}
