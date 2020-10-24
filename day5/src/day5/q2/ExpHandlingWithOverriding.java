package day5.q2;

import java.io.IOException;

class A  {
	void foo()  throws Exception{
		
	}
}

class B extends A{
void foo()  throws IOException{
		
	}
	
}
public class ExpHandlingWithOverriding {
	A a=new B();
	{
	try {
		a.foo();
	}
	catch(Exception ex){
		System.out.println("");
	}

}}
