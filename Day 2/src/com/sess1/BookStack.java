package com.sess1;

public class BookStack {
	private Book x[];
	private final int SIZE;
	private int top;
	
	public BookStack() {
		SIZE =5;
		x=new Book[SIZE];
		top=-1;
	}
	public Book pop() {
		Book value =new Book(-99,"new",0);
		if(isEmpty()) 
			System.out.println("Empty");
		else { 
				//value =x[top--];//memory leak happens because of dangling pointer
				value=x[top];
				x[top]=null;
				top--;
		}
		return value;
		
	}
	private boolean isEmpty() {
		return (top==-1)?true:false;
	}
	public void push(Book data) {
		if(isFully())
			System.out.println("stack is full");
			else {
				x[++top]= data;
			}
	}
	private boolean isFully() {
		// TODO Auto-generated method stub
		return (top==SIZE-1)?true:false;
	}
	
}
