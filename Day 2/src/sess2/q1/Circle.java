package sess2.q1;

public class Circle {
	
		private double radius=1.0;
		private String color="red";
		
		public Circle() {
			 radius = 1.0;
		      color = "red";
		}
		public Circle(double radius) {
			this.radius=radius;
			this.color="red";
		}
		
		public double getRadius() {
			return radius;
		}
		
		public double getArea() {
			return Math.PI*radius*radius;
		}
		

	}

