package com.lab2.q2;

import java.util.Scanner;

public class BookStoreApp {
	public static void main(String args[]){
		BookStore bookstore= new BookStore();
		bookstore.push(new Book("A thousand splendid suns","Khaled hossini","456",5));
		bookstore.push(new Book("Kafka On The Shore","Murakami","123",5));
		bookstore.push(new Book("Sapiens","Noah Harari","789",5));
		bookstore.push(new Book("monk who sold his ferari","Robin sharma","101112",5));
		bookstore.push(new Book("Rich dad poor dad","kiyosaki","131415",5));
		
		System.out.println("Select from 0.Exit  1.display  2.order  3.sell");
		Scanner scanner =new Scanner(System.in);
		int select=-1;
		select=scanner.nextInt();
		
		
	switch(select) {
	
	case 0:
		System.out.println("exit");
		break;
	
	case 1:
		bookstore.display();
		break;
		
	case 2:
		System.out.println("enter isbn and no of copies");
		String isbn=scanner.next();
		int copy=scanner.nextInt();
		bookstore.order(isbn,copy);
		break;
		
	case 3:
		System.out.println("enter title and no of copies");
		String title=scanner.next();
		int copy1=scanner.nextInt();
		bookstore.sell(title,copy1);
		break;
		
	}
		scanner.close();
		
	}
 

}
