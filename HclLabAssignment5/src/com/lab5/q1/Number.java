package com.lab5.q1;

class Number implements Runnable{
	int i=1;
	int remainder;
	static Object Lock =new Object();
	Number(int remainder) {
		this.remainder=remainder;
	}
	public void run() {
	while( i<=100) {
		synchronized(Lock){
		while(i%3!=remainder)
				try {
					Lock.wait();
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
	System.out.println(Thread.currentThread().getName()+ " : " +i);
	i++;
	Lock.notifyAll();}
	}
	}
}