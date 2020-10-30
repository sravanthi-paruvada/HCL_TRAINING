package com.lab5.q1;



public class MultiThreading {
public static void main(String[] args) {
	
	Number num1=new Number(1);
	Number num2=new Number(2);
	Number num3=new Number(0);
	
	Thread thread1=new Thread(num1,"Thread 1");
	Thread thread2=new Thread(num2,"Thread 2");
	Thread thread3=new Thread(num3,"thread 3");
	
	thread1.start();
	thread2.start();
	thread3.start();
	
}

}
