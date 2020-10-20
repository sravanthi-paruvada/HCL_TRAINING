package sess2.q4;

public class Convertible extends Car {
	boolean isHoodOpen;
	
	public Convertible(int noOfWheels, int noOfPassenger, int model, String make, int noOfDoor,boolean isHoodOpen) {
		super(noOfWheels, noOfPassenger, model, make, noOfDoor);
			this.isHoodOpen=isHoodOpen;
		// TODO Auto-generated constructor stub
	}
	
		void display() {
			super.display();
			System.out.println("Is Hood Open:  " +isHoodOpen);
		}
	
	

}
