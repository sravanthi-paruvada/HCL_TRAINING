package com.lab2.q2;

public class BookStore {
	private Book book[];
	private final int SIZE;
	private int top;
	
	public BookStore() {
		SIZE =5;
		book=new Book[SIZE];
		top=-1;
	}
	
	public Book pop() {
		Book value =new Book("new book","new","0907",10);
		if(isEmpty()) 
			System.out.println("Empty");
		else { 
				//value =x[top--];//memory leak happens because of dangling pointer
				value=book[top];
				book[top]=null;
				top--;
		}
		return value;
		
	}
	private boolean isEmpty() {
		return (top==-1)?true:false;
	}
	public void push(Book data ) {
		if(isFully())
			System.out.println("stack is full");
			else {
				book[++top]= data ;
			}
	}
	
	private boolean isFully() {
		
		return (top==SIZE-1)?true:false;
	}
	
	void sell(String title,int noOfCopies) 
	{
		//if((title=="Kafka On The Shore")||(title=="A thousand splendid suns")||(title=="Sapiens")||(title=="monk who sold his ferari")||(title=="Rich dad poor dad")) 
		for(int i=0;i<SIZE;i++)
		 if(title.equals(book[i].getTitle()))	
			{
			noOfCopies=noOfCopies-1;
			System.out.println(" Book Sold!Do you want to sell another book?");
			
			}
		else 
			System.out.println("Book not found");
		
	}
	
	void order(String ISBN,int noOfCopies) 
	{
		//if((ISBN.equals("123"))||(ISBN=="456")||(ISBN=="789")||(ISBN=="101112")||(ISBN=="131415")) 
		for(int i=0;i<SIZE;i++)
			if(ISBN.equals(book[i].getISBN()))
		
			 {
			System.out.println(" Order Complete!Do you want to order another book?");
			noOfCopies=noOfCopies+1;  
			 }
		
		else
			System.out.println("Book doesnot exist.Order new book");
	}
	

	void display(){
		
	for(int i=0;i<SIZE;i++) 
		book[i].printBookDetails();
		
	}

}
