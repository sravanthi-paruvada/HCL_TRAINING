package day3;

public class Calculator {
	public static void main(String args[]) {
		function cal=new function();
		cal.add(396712289,2);
		
	}
	

}

class function{
	public int add(int a, int b) {
		return a+b;
	}
	
	public long add(long a, int b) {
		return a+b;
	}
	
}