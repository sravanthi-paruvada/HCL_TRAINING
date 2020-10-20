package com.sess1;

public class BookStackTester {
	public static void main(String args[]) {
		BookStack bookStack =new BookStack();
		//---------------------------------------------------------------------------------
		bookStack.push(new Book(3,"java",90.7));
		bookStack.push(new Book(21,"python",87.6));
		bookStack.push(new Book(1,"dotnet",76.78));
		bookStack.push(new Book(12,"cpp",98.67));
		
		    Book b1=bookStack.pop();
	        Book b2=bookStack.pop();
	        Book b3=bookStack.pop();
	        Book b4=bookStack.pop();
	        Book b5=bookStack.pop();
	        
	        b1.printBookDetails();
	        b2.printBookDetails();
	        b3.printBookDetails();
	        b4.printBookDetails();
	        b5.printBookDetails();
		
	}

}
