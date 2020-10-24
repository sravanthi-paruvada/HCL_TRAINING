package day6.q1;
import java.util.*;
public class ProductMain {
	public static void main(String []args) {
		List<Product> list=new LinkedList<Product>();
		list.add(new Product(121,"Mouse",400,"Electronics",0.15));
		list.add(new Product(221,"KB",400,"Electronics",0.10));
		list.add(new Product(521,"laptop",900,"Electronics",0.25));
		list.add(new Product(431,"Books",100,"book",0.35));
		System.out.println("entered  ---------------");
		printBooks(list);
		System.out.println("sorted ---------------");
		Collections.sort(list);
		printBooks(list);
		System.out.println("sorted by category  ---------------");
		Collections.sort(list, new sortCategory());
		printBooks(list);
		System.out.println("sorted by price ---------------");
		Collections.sort(list, new sortprice());
		printBooks(list);
		System.out.println("sorted by price then discount ---------------");
		Collections.sort(list, new sortpricethenDiscount());
		printBooks(list);
		
		
	}

	static void printBooks(List<Product> list) {
		for(Product temp:list) {
			System.out.println(temp);
		}
	}
	

}
