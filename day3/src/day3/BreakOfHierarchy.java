package day3;

//breaking of hierarchy and interface


class Bird{
	void eat() {
		System.out.println("I eat");
		
	}
	void fly() {
		System.out.println("I fly");
		
	}
	void swim() {
		System.out.println("I swim");
		
	}
	
}
interface flyable{
	//System.out.println("I fly");
	void fly();	
}

interface swimable{
	void swim();
}
class Eagle extends Bird implements flyable{
	public void fly() {
		System.out.println("Eagles fly");
	}
	
}

class Duck extends Bird implements swimable{
	public void swim() {
		System.out.println("Ducks swim");
	}
	
}
public class BreakOfHierarchy {
	public static void main(String []args) {
		
		Eagle eagle =new Eagle();
		eagle.fly();
		Bird duck=new Duck(); //a part of upcasting
		duck.swim();
	}

}
