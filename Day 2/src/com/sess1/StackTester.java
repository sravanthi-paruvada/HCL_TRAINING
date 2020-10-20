package com.sess1;

public class StackTester {
	public static void main(String args[]) {
		Stack stack =new Stack();
		stack.push(10);
		stack.push(3);
		stack.push(21);
		stack.push(1);
		stack.push(12);
		System.out.println("10 3 21 1 12");
		System.out.print(stack.pop()+" ");
		System.out.print(stack.pop()+" ");
		System.out.print(stack.pop()+" ");
		System.out.print(stack.pop()+" ");
		System.out.print(stack.pop()+" ");
		
	}

}
