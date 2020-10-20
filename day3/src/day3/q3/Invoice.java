package day3.q3;

public class Invoice implements Payable{
	
	private String partNum;
	private String partDescription;
	int qty;
	double price;
	
	
	public Invoice(String partNum, String partDescription, int qty, double price) {
		super();
		this.partNum = partNum;
		this.partDescription = partDescription;
		this.qty = qty;
		this.price = price;
	}
	public String getPartNum() {
		return partNum;
	}
	public void setPartNum(String partNum) {
		this.partNum = partNum;
	}
	public String getPartDescription() {
		return partDescription;
	}
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	@Override
	
	public double getPayment() {
			return qty*price;
	}
	
	public void display() {
		System.out.println("Part num: "+partNum+"  Part Description:  "+partDescription+"  quantity:  "+qty+"  Price per quantity  "+price);
		
	}
	
	
	
	

}
