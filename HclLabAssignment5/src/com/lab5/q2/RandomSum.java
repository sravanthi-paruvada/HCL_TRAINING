package com.lab5.q2;

import java.util.Random;

public class RandomSum implements Runnable{

	private int sum;
	public  RandomSum(int sum){
		this.sum=sum;
	}
	public int getSum() {
		return sum;
	}
	@Override
	public void run() {
		Random random=new Random();
		int val=random.nextInt(10)+1;
		System.out.println(Thread.currentThread().getName() +" : " +val);
		synchronized(this) {
			this.sum +=val;
		}
		
	}

}
