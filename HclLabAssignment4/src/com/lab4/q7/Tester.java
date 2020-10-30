package com.lab4.q7;
import java.io.IOException;
public class Tester {
	public static void main(String []args) {
		ThrowException  tex=new ThrowException();
		try {
			tex.throwException(); //two catch blocks are added because both the exceptions thrown need to be handled.
		}
		catch(InputException e){
			e.printStackTrace();
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
