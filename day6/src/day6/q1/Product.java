package day6.q1;
import java.util.*;

class sortCategory implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		
		return o1.getCategory().compareTo(o2.getCategory());
	}
	
}

class sortprice implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		
		return Double.compare(o1.getProPrice(),o2.getProPrice());
	}
	
}

class sortpricethenDiscount implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		
		int value= Double.compare(o1.getProPrice(),o2.getProPrice());
		if(value==0) {
			value =Double.compare(o2.getDiscount(),o1.getDiscount());
		}
		return value;
	}
	
}

public class Product implements Comparable<Product>{
	private int id;
	private String proName;
	private double proPrice;
	private String category;
	private double discount;
	public Product(int id, String proName, double proPrice, String category, double discount) {
		
		this.id = id;
		this.proName = proName;
		this.proPrice = proPrice;
		this.category = category;
		this.discount = discount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public double getProPrice() {
		return proPrice;
	}
	public void setProPrice(double proPrice) {
		this.proPrice = proPrice;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [id=");
		builder.append(id);
		builder.append(", proName=");
		builder.append(proName);
		builder.append(", proPrice=");
		builder.append(proPrice);
		builder.append(", category=");
		builder.append(category);
		builder.append(", discount=");
		builder.append(discount);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public int compareTo(Product o) {
		
		return Integer.compare(this.getId(),o.getId());
	}
	
	

}
