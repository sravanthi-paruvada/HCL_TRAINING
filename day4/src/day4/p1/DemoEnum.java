package day4.p1;

enum ShirtSize{
	s(38),m(40),l(42),xl(44);
	private int size;
	private ShirtSize(int size) {
		this.size=size;
		
	}
}

class Shirt{
	private String brand;
	private double price;
	private ShirtSize size;
	public Shirt(String brand, double price,ShirtSize size) {
		
		this.brand = brand;
		this.price = price;
		this.size=size;
	}
	@Override
	public String toString() {
		return "Shirt [brand=" + brand + ", price=" + price + ", size=" + size + "]";
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public ShirtSize getSize() {
		return size;
	}
	public void setSize(ShirtSize size) {
		this.size = size;
	}
	
	
}
public class DemoEnum {
	public static void main(String []args) {
		
		//enumcan be used for switch case
		ShirtSize size=ShirtSize.valueOf("m");
		switch(size) {
		case m:
		case s:
			
		}
		//converting sring to enum
		//ShirtSize shirtsize=ShirtSize.valueOf("s");
		//String size1=ShirtSize.m.name();
		//ShirtSize size=ShirtSize.m;
		//Shirt shirt=new Shirt("PE",789.67,size);
		
	}

}
