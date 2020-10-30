package com.lab6.q3;

import java.util.Comparator;

//to compare more than one sqe=uence using comparator

class BookSortbyTitle implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		
		return o1.getTitle().compareTo(o2.getTitle());
	}
	
}
class BookSortbyPrice implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		
		return Double.compare(o1.getPrice(),o2.getPrice());
	}
}

class BookSortbyPricethenbyPages implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		
		int value =Double.compare(o1.getPrice(),o2.getPrice());
		if(value==0)
			value=Double.compare(o1.getPages(),o2.getPages());
		return value;
			
	}
}

public class Book implements Comparable<Book> {

	private int id;
	private String title;
	private int price;
	private int pages;
	public Book(int id, String title, int price,int pages) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
		this.pages=pages;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Book [id=");
		builder.append(id);
		builder.append(", title=");
		builder.append(title);
		builder.append(", price=");
		builder.append(price);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public int compareTo(Book o) {
		//can only define one sort sequence 
		return Integer.compare(this.getId(),o.getId());
	}
	
	
	
}