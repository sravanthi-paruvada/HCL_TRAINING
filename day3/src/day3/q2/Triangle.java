package day3.q2;

public class Triangle {
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	public Triangle(Point pointA, Point pointB, Point pointC) {
		
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
	}
	
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public Triangle(int x1,int y1,int x2,int y2,int x3,int y3) {
		
		this.pointA = new Point(x1,y1);
		this.pointB = new Point(x2,y2);
		this.pointC = new Point(x3,y3);
	}

	@Override
	public String toString() {
		return "Triangle [pointA=" + pointA + ", pointB=" + pointB + ", pointC=" + pointC + "]";
	}
	
	public void getperimeter() {
		double l1=Math.sqrt(Math.pow((pointB.getX()-pointA.getX()),2)+Math.pow((pointB.getY()-pointA.getY()),2));
	//return l1;
		System.out.println(l1);
	}
	

}
