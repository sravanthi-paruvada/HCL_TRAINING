package day6.p1;

import java.util.*;

public class NeedofComparable {
	public static void main(String []args) {
		ArrayList<Book> books=new ArrayList<>();
		books.add(new Book(121,"java",543,300));
		books.add(new Book(253,"c",403,500));
		books.add(new Book(781,"Python",300,150));
		
		for(Book temp:books) {
			System.out.println(temp);
		}
		
		Collections.sort(books);//sorted by comparable
		
		for(Book temp:books) {
			System.out.println(temp);
		}
		//sorted by comparator
		Collections.sort(books,new BookSortbyTitle());
		for(Book temp:books) {
			System.out.println(temp);
		}
		
		Collections.sort(books,new BookSortbyPricethenbyPages());
		for(Book temp:books) {
			System.out.println(temp);
		}
		
		
	}

}
