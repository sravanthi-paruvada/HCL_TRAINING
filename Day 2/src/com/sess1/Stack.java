package com.sess1;

public class Stack {
	private int x[];
	private final int SIZE;
	private int top;
	
	public Stack() {
		SIZE =5;
		x=new int[SIZE];
		top=-1;
	}
	public int pop() {
		int value =-999;
		if(isEmpty()) 
			System.out.println("Empty");
		else { 
		value =x[top--];//memory leak happens because of dangling pointer
		
		}
		return value;
		
	}
	private boolean isEmpty() {
		return (top==-1)?true:false;
	}
	public void push(int data) {
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
